<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html lang="en">


<jsp:include page="head.jsp"></jsp:include>

  <body>
  <!-- Pre-loader start -->
  
  <jsp:include page="theme-loader.jsp"></jsp:include>
  
  <!-- Pre-loader end -->
  <div id="pcoded" class="pcoded">
      <div class="pcoded-overlay-box"></div>
      <div class="pcoded-container navbar-wrapper">
          
          <jsp:include page="navbar.jsp"></jsp:include>

          <div class="pcoded-main-container">
              <div class="pcoded-wrapper">
                  
                  <jsp:include page="navbarmainmenu.jsp"></jsp:include>
                  
                  <div class="pcoded-content">
                      <!-- Page-header start -->
                      
                      <jsp:include page="page-head.jsp"></jsp:include>
                      
                      <!-- Page-header end -->
                        <div class="pcoded-inner-content">
                            <!-- Main-body start -->
                            <div class="main-body">
                                <div class="page-wrapper">
                                    <!-- Page-body start -->
                                    <div class="page-body">
                                              
                                           <div class="row">
                                            <div class="col-sm-12">
                                                <!-- Basic Form Inputs card start -->
                                                <div class="card">
                                                    <div class="card-block">
                                                        <h4 class="sub-title">Book Registration</h4>
		                                              
          												 <form class="form-material" action="ServletCadLivro" method="post">
                                                            <div class="form-group form-default">
                                                            
                                                                <input type="text" name="id" id="id" class="form-control"  readonly="readonly" value="${modoLog.id}">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">ID:</label>
                                                            </div>
                                                            
                                                              <div class="form-group form-default">
                                                                <input type="text" name="nomeaut" id="nomeaut" class="form-control" required="required" value="${modoLog.nomeaut}">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">Author:</label>
                                                            </div>
                                                            
                                                            <div class="form-group form-default">
                                                                <input type="text" name="titulob" id="titulob" class="form-control" required="required"  value="${modoLog.titulob}">
                                                                <span class="form-bar"></span>
                                                                <label class="float-label">Title Book:</label>
                                                            </div>
                                                            
                                                        
                                                            <button class="btn btn-primary waves-effect waves-light">Novo</button>
												            <button class="btn btn-success waves-effect waves-light">Salvar</button>
												            <button class="btn btn-info waves-effect waves-light">Excluir</button>
                                                        </form> 
                                                   
                                                </div>
                                                </div>
                                                </div>
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