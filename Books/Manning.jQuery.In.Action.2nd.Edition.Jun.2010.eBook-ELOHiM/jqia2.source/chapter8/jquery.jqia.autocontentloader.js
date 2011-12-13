(function($){

  $.fn.autoContentLoader = function() {
    this.bind('jqiaLoadContent',function(event,info){
      $(this).load(info.url,info.parameters,info.callback);
    });
  };

})(jQuery);
