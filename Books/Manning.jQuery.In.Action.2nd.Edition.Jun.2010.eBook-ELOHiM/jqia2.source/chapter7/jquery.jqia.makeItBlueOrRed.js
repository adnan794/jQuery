(function($){
  $.fn.makeItBlueOrRed = function() {
    return this.each(function(){
      $(this).css('color',$(this).is('[id]') ? 'blue' : 'red');
    });
  };
})(jQuery);
