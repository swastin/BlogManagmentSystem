<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="/partials/head.jsp"></jsp:include>
<body>
<div class="ui one column center aligned grid">
  <div class="column six wide form-holder">
    <h2 class="center aligned header form-head">Sign in</h2>
    <div class="ui form">
      <div class="field">
        <input type="text" placeholder="username">
      </div>
      <div class="field">
        <input type="password" placeholder="password">
      </div>
      <div class="field">
        <input type="submit" value="sign in" class="ui button large fluid green">
      </div>
      <div class="inline field">
        <div class="ui checkbox">
          <input type="checkbox">
          <label>Remember me</label>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
<jsp:include page="/partials/foot.jsp"></jsp:include>
</html>