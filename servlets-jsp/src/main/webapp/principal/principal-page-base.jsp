<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="theme-loader.jsp"></jsp:include>






  <body>
  <!-- Pre-loader start -->
  
  <div id="pcoded" class="pcoded">
      <div class="pcoded-overlay-box"></div>
      <div class="pcoded-container navbar-wrapper">
            <jsp:include page="navbar.jsp"></jsp:include>
      
      
         

          <div class="pcoded-main-container">
              <div class="pcoded-wrapper">
              <jsp:include page="navbarmainmenu.jsp"></jsp:include>
              
                  
                  <div class="pcoded-content">

                  <jsp:include page="page-head.jsp"></jsp:include>
                        <div class="pcoded-inner-content">
                            <!-- Main-body start -->
                            <div class="main-body">
                                <div class="page-wrapper">
                                    <!-- Page-body start -->
                                    <div class="page-body">
                                        <div class ="row">
                                        <h3>PAGINA BASE</h3>
                                        </div>
                                    </div>
                                    <!-- Page-body end -->
                                </div>
                                <div id="styleSelector"> </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
   <jsp:include page="javascriptfile.jsp"></jsp:include>
</body>

</html>