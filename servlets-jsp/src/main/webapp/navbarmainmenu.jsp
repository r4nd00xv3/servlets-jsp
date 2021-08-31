<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<nav class="pcoded-navbar">
                      <div class="sidebar_toggle"><a href="#"><i class="icon-close icons"></i></a></div>
                      <div class="pcoded-inner-navbar main-menu">
                          <div class="">
                              <div class="main-menu-header">
                                  <img class="img-80 img-radius" src="<%=request.getContextPath() %>/assets/images/avatar-4.jpg" alt="User-Profile-Image">
                                  <div class="user-details">
                                      <span id="more-details"><%= session.getAttribute("usuario") %><i class="fa fa-caret-down"></i></span>
                                  </div>
                              </div>
        
                              <div class="main-menu-content">
                                  <ul>
                                      <li class="more-details">
                                          <a href="#!"><i class="ti-settings"></i>Settings</a>
                                          <a href="ServletLogin?acao=logout"><i class="ti-layout-sidebar-left"></i>Logout</a>
                                      </li>
                                  </ul>
                              </div>
                          </div>
                          <div class="p-15 p-b-0">
                              <form class="form-material">
                                  <div class="form-group form-primary">
                                      <input type="text" name="footer-email" class="form-control" required="">
                                      <span class="form-bar"></span>
                                      <label class="float-label"><i class="fa fa-search m-r-10"></i>Search Friend</label>
                                  </div>
                              </form>
                          </div>
                          
                              
                             
                                      
                                     
                          <div class="pcoded-navigation-label" data-i18n="nav.category.forms">Books</div>
                          <ul class="pcoded-item pcoded-left-item">
                              <li>
                                  <a href="cadlivro.jsp" class="waves-effect waves-dark">
                                      <span class="pcoded-micon"><i class="ti-layers"></i><b>FC</b></span>
                                      <span class="pcoded-mtext" data-i18n="nav.form-components.main">My Books</span>
                                      <span class="pcoded-mcaret"></span>
                                  </a>
                              </li>
                                      
                          </ul>
        
                          
                          
        
                          
                  </nav>