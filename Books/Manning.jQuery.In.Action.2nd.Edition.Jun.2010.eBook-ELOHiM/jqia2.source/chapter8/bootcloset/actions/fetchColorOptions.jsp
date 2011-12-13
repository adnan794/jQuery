<option value="">&mdash; choose color &mdash;</option>
<c:choose>
  <c:when test="${param.style=='7141832'}">
    <option value="bk">Black Oil-tanned</option>
    <option value="br">Black Polishable</option>
  </c:when>
  <c:when test="${param.style=='7173656'}">
    <option value="bk">Black</option>
    <option value="br">Crazy Horse</option>
  </c:when>
  <c:when test="${param.style=='7141922'}">
    <option value="bk">Black</option>
    <option value="br">Crazy Horse</option>
  </c:when>
  <c:when test="${param.style=='7177382'}">
    <option value="hy">Honey</option>
    <option value="sd">Peanut</option>
  </c:when>
  <c:when test="${param.style=='7141730'}">
    <option value="rw">Brown</option>
    <option value="hy">Honey</option>
  </c:when>
  <c:when test="${param.style=='7141833'}">
    <option value="br">Russet</option>
  </c:when>
  <c:when test="${param.style=='7257914'}">
    <option value="br">Brown</option>
  </c:when>
  <c:when test="${param.style=='7269643'}">
    <option value="bk">Black</option>
  </c:when>
  <c:when test="${param.style=='7332058'}">
    <option value="bk">Tan/Brown/Amber</option>
  </c:when>
  <c:otherwise>
    <option value="bk">Black</option>
  </c:otherwise>
</c:choose>
