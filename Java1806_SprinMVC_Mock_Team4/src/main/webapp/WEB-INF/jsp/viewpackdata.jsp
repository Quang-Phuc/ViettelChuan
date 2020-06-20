<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<jsp:include page="headerAdmin.jsp" />

<!-- Main content -->
<section class="content">
	<div class="row">
		<div class="col-xs-12">
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Thông tin dữ liệu</h3>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<table id="example2" class="table table-bordered table-hover">
						<thead>
							<tr><th>STT</th>
								<th>Tên</th>
								<th>Miêu tả</th>
								<th>Chi tiết</th>
								<th>Cú pháp Đk</th>
								<th>Chức năng</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listPackData}" var="listPackData"
								varStatus="vs">
								<tr>
									<td><c:out value="${listPackData.packs.id}"></c:out></td>
									<td><c:out value="${listPackData.name}"></c:out></td>
									<td><p hidden id="myParagraph${vs.index}">
											<c:out value="${listPackData.description}"></c:out>
										</p>

										<p>
											<script>
															var index = ${vs.index}
															var theString = document
																	.getElementById("myParagraph"+ index).innerHTML;
															var varTitle = $(
																	'<textarea />')
																	.html(
																			theString)
																	.text();
															document
																	.write(varTitle);
														</script>
										</p></td>
									<td><p hidden id="myParagraph${vs.index}">
											<c:out value="${listPackData.detail}"></c:out>
										</p>
										<p>
											<script>
															var index = ${vs.index}
															var theString = document
																	.getElementById("myParagraph"+ index).innerHTML;
															var varTitle = $(
																	'<textarea />')
																	.html(
																			theString)
																	.text();
															document
																	.write(varTitle);
														</script>
										</p></td>
									<td><c:out value="${listPackData.contentSms}"></c:out>
										<div style="color: red;">Gửi</div>
										<c:out value="${listPackData.phoneSms}"></c:out></td>

									<td><a
										href="deletePackData?packDataId=<c:out value="${listPackData.id }"></c:out>">Xoa</a>
										<a
										href="updatePackData?packDataId=<c:out value="${listPackData.id }"></c:out>">Sua</a>
									</td>

								</tr>
							</c:forEach>
						</tbody>
						<tfoot>
							
						</tfoot>
					</table>
				</div>
				<!-- /.box-body -->
			</div>
			<!-- /.box -->


		</div>
		<!-- /.col -->
	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->
<jsp:include page="footerAdmin.jsp" />
