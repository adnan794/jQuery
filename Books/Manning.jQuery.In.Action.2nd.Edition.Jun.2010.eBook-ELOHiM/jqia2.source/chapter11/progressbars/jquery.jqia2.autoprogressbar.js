(function($){

  $.fn.autoProgressbar = function(settings,value) {
    if (typeof settings === "string") {
      switch (settings) {
        case 'stop':
          this.each(function(){
            window.clearInterval($(this).data('autoProgressbar-interval'))
          });
          break;
        case 'value':
          if (value == null) return this.progressbar('value');
          this.progressbar('value',value);
          break;
        case 'destroy':
          this.autoProgressbar('stop');
          this.progressbar('destroy');
          break;
        default:
          break;
      }
    }
    else {
      settings = $.extend({
        pulseUrl: null,
        pulseData: null,
        interval: 1000,
        change: null
      },settings||{});
      if (settings.pulseUrl == null) return this;
      this.progressbar({value:0,change:settings.change});
      this.each(function(){
        var bar$ = $(this);
        bar$.data(
          'autoProgressbar-interval',
          window.setInterval(function(){
            $.ajax({
              url: settings.pulseUrl,
              data: settings.pulseData,
              global: false,
              dataType: 'json',
              success: function(value){
                if (value != null) bar$.autoProgressbar('value',value);
                if (value == 100) bar$.autoProgressbar('stop');
              }
            });
          },settings.interval));
      });
    }
    return this;
  };

})(jQuery);
