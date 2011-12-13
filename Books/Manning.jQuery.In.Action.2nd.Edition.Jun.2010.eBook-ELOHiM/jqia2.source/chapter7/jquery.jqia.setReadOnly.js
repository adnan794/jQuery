(function($){
  $.fn.setReadOnly = function(readonly) {
    return this.filter('input:text')
      .attr('readOnly',readonly)
      .css('opacity', readonly ? 0.5 : 1.0)
      .end();
  };
})(jQuery);
