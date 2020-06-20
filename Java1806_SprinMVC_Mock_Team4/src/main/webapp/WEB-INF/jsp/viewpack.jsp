<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />

        <!-- Main content -->
        <section class="content">
          <div class="row">
            <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">Hover Data Table</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table id="example2" class="table table-bordered table-hover">
                    <thead>
                      <tr>
                        <th>Tên gói cước</th>
                        <th>Miêu tả</th>
                        <th>Hành động</th>
                       
                        
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listPacks}" var="listPacks">
                      <tr>
                        <td><c:out value="${listPacks.title}"></c:out></td>
                         <td><c:out value="${listPacks.detail}"></c:out></td>
                        
                        <td> <a href="deletePack?packId=<c:out value="${listPacks.id}"></c:out>">Xoa</a> 
                        	 <a href="updatePack?packId=<c:out value="${listPacks.id}"></c:out>">Sua</a> 
                        </td>
                        
                      </tr>
    				</c:forEach>
                    </tbody>
                    <tfoot>
                      <tr>
                        <th>Kết thúc</th>
                         <th>Kết thúc</th>
                          <th>Kết thúc</th>
                       
                        
                      </tr>
                    </tfoot>
                  </table>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

             
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
      <jsp:include page="footerAdmin.jsp" />  