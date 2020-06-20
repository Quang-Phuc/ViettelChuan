<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />
        <!-- Main content -->
        <form action="savePackData" method="post">
        <section class="content">
          <div class="row">
            
            <div class="col-md-9">
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">Đăng tin gói cước</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                
                 <div class="form-group">
                <select name="packs.id">

						<c:forEach var="listPack" items="${listPack}">
							<option value="<c:out value="${listPack.id}"></c:out>">
								<c:out value="${listPack.title}"></c:out>
							</option>
						</c:forEach>
					</select>
                  
                  </div>
					
                  <div class="form-group">
                  <label>Tên gói cước</label>
                    <input name ="name" class= "form-control" placeholder="Tên gói cước :"/>
                  </div>
				   <label>Mô tả ngắn</label>
                  <div class="form-group">
				 
                   <textarea id="editor2" name="description" cols="80" rows="10">
						
					</textarea>
                  </div>
                  <div class="form-group">
				  <label>Mô tả chi tiết gói cước</label>
                   <textarea id="editor1" name="detail" cols="80" rows="10">
						
					</textarea>
                  </div>
                  <div class="form-group">
                  <label>Nội dung tin nhắn SMS</label>
                    <input name ="contentSms" class= "form-control" placeholder="Nhập nội dung tin nhắn:"/>
                  </div>
                  <div class="form-group">
                  <label>Số điện thoại gửi tin nhắn</label>
                    <input name ="phoneSms" class= "form-control" placeholder="Nhập số điện thoại gửi tin nhắn:"/>
                  </div>
              
                </div><!-- /.box-body -->
                <div class="box-footer">
                  <div class="pull-right">
                   
                    <button type="submit" class="btn btn-primary">Đăng tin</button>
                  </div>
                  <button class="btn btn-default"><i class="fa fa-times"></i> Hủy</button>
                </div><!-- /.box-footer -->
              </div><!-- /. box -->
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
        </form>
      </div><!-- /.content-wrapper -->
      <jsp:include page="footerAdmin.jsp" />  