(function($){
  $.fn.elementsForDisplay = function() {
    var list = [];
    this.each(function(){
      var text = this.tagName;
      if (this.id != undefined && this.id.length > 0) text += '#' + this.id;
      list.push(text);
    });
    return list;
  };
})(jQuery);
