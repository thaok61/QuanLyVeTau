<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Tàu Sắt Việt Nam (1900 636963)</h2>
		<ul class="nav nav-tabs">
			<li><a data-toggle="tab" href="#datve">Đặt vé tàu</a></li>
			<li><a data-toggle="tab" href="#lich">Lịch tàu chạy</a></li>
			<li><a data-toggle="tab" href="#tau">Thông tin tàu</a></li>
			<li><a data-toggle="tab" href="#km">Khuyến mại</a></li>
			<li><a data-toggle="tab" href="#camnang">Cẩm nang đi tàu</a></li>
			<li><a data-toggle="tab" href="#tracuu">Tra cứu giao dịch</a></li>
		</ul>

		<div class="tab-content">
			<div id="datve" class="tab-pane fade">
				<h3>Hướng dẫn đặt vé</h3>
				<p>
					- Truy cập "lịch tàu chạy" để lấy thông tin thời gian, điểm đến<br>
					- Chuyển sang tab thông tin tàu để cập nhật "mã chỗ", lưu ý mã chỗ
					có người đặt trước hành khách sẽ không đặt được.<br> - Phần
					khuyến mại sẽ chứa thông tin đối tượng đang được ưu đãi <br> -
					Sau khi có đủ thông tin khách click nút "Đặt vé" để tiến hành đặt
					vé. <br>
				</p>
				<a href="http://localhost:8080/QuanLyVeTau/customer">Đặt Vé</a>
			</div>
			<div id="lich" class="tab-pane fade">
				<h3>Lịch tàu hoạt động trong tháng</h3>
				<br>
				<p>
					Lịch tàu chạy liên tục được cập nhật trong link bên dưới<br>
					Nhấp vào link để lấy thông tin hoạt động của tàu tới điểm đến của
					bạn. <br> <a
						href="https://drive.google.com/open?id=1-vuzVYRDniKk53QPMIu92cnFIB6ArKxM">Click
						here</a>
				</p>
			</div>

			<div id="tau" class="tab-pane fade">
					<table border="1">
						<tr>
							<th>Mã tàu</th>
							<th>Số chỗ</th>
							<th>Ghi chú</th>
						</tr>
						<tr>
							<td>SE1</td>
							<td>50</td>
							<td></td>
						</tr>
						<tr>
							<td>SE2</td>
							<td>40</td>
							<td></td>
						</tr>
						<tr>
							<td>SE3</td>
							<td>50</td>
							<td></td>
						</tr>
						<tr>
							<td>SE4</td>
							<td>40</td>
							<td></td>
						</tr>
						<tr>
							<td>SE5</td>
							<td>50</td>
							<td></td>
						</tr>
					</table>
				<p>
					Lưu ý: Mã chỗ chạy từ 01 cho tới số chỗ tối đa. <br> Ví dụ:
					Toa SE1 có 50 chỗ, mã chỗ sẽ chạy từ 01 tới 50.
				</p>
			</div>


			<div id="km" class="tab-pane fade">
				<strong> <br> - Trẻ từ dưới 10 tuổi luôn luôn được
					giảm 25% khi đặt vé <br> - Người cao tuổi trên 60 tuổi giảm
					15% giá vé <br> - Sinh viên có thẻ các trường cao đẳng, đại
					học, trung cấp sẽ giảm 10% <br>
				</strong>
				<p>
					<br>Lưu ý: cung cấp đầy đủ thông tin chính xác để được hưởng
					ưu đãi.
				</p>
			</div>

			<div id="camnang" class="tab-pane fade">
				<strong> <br> - Cập nhật những thông tin vé tàu khuyến
					mãi trực tuyến, vé giảm giá sinh viên, giảm đoàn, giảm hè du lịch,
					... được đại lý của đường sắt cập nhật mỗi ngày tại website mua vé
					tàu ngay hôm nay để được giảm giá. <br> - Đặt mua vé tàu tết
					mọi năm rất khó khăn với nhiều người, do phải đến ga xếp hàng, đăng
					ký mua vé giới hạn số lượng, nhiều khi phải mua vé chợ đen vv...
					hãy mua vé tàu lửa tết trực tuyến để nhanh chóng, tiện nghi nhất,
					đặt vé khung bên cạnh hoặc điện thoại cho nhân viên vé tàu trực
					tuyến hỗ trợ.<br> - Người lớn mình đi bằng CMND, Hộ Chiếu,
					Bằng Lái, vv.... hoặc đăng ký mua vé không có giấy tờ.<br> -
					Trẻ em đi bằng giấy khai sinh, Hộ chiếu, ... <br>
				</strong>

			</div>

			<div id="tracuu" class="tab-pane fade">
				<h3>Tra cứu giao dịch</h3>
				<p>Nhập số điện thoại của bạn để tiến hành tra cứu thông tin
					giao dịch</p>
			</div>
		</div>
	</div>

</body>
</html>
