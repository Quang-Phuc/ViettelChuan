<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />

        <!-- Main content -->
        <form action="saveHome" method="post">
        <section class="content">
          <div class="row">
            
            <div class="col-md-9">
              <div class="box box-primary">
                <div class="box-header with-border">
                 
                </div><!-- /.box-header -->
            <h3> <p style="color: red;text-transform: uppercase;font-family: 'Montserrat', sans-serif;"><c:out value="${userSession.userName}"></c:out></p>  Thực hiện các thao tác quản lý website tại menu </h3>
              </div><!-- /. box -->
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
        </form>
      </div><!-- /.content-wrapper -->
      
  <jsp:include page="footerAdmin.jsp" />   