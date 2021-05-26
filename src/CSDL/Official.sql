CREATE DATABASE [Library]
GO
USE [Library]
GO

CREATE TABLE [dbo].[tblNhaXuatBan](
	[MaNXB] [char](6) PRIMARY KEY,
	[TenNXB] [nvarchar](300) NOT NULL
)
GO 

CREATE TABLE [dbo].[tblTheLoai](
	[MaTheLoai] [char](6) PRIMARY KEY,
	[TenLoaiSach] [nvarchar](200) NOT NULL
)
GO 

CREATE TABLE [dbo].[tblDocGia](
	[MaDocGia] [char](6) PRIMARY KEY,
	[HoTenDG] [nvarchar](100) NULL,
	[GioiTinh] [nvarchar](10) NOT NULL,
	[NgaySinh] [varchar](50) NOT NULL,
	[DiaChi] [nvarchar](200) NOT NULL,
	[SoDienThoai] [varchar](11) NULL,
	[NgayDangKi] [varchar](50) NOT NULL,
	[NgayHetHanDK] [varchar](50) NULL
)
GO 

CREATE TABLE [dbo].[tblTacGia](
	[MaTacGia] [char](6) PRIMARY KEY,
	[TenTacGia] [nvarchar](200) NOT NULL
)
GO 

CREATE TABLE [dbo].[tblTuaSach](
	[MaTuaSach] [char](6) PRIMARY KEY,
	[TenTuaSach] [nvarchar](500) NOT NULL,
	[MaTacGia] [char](6) NULL FOREIGN KEY REFERENCES tblTacGia(MaTacGia),
	[MaTheLoai] [char](6) NULL FOREIGN KEY REFERENCES tblTheLoai(MaTheLoai),
	[TomTat] [nvarchar](200) NULL,
	[SoLuong] [int] NULL
)
GO 

CREATE TABLE [dbo].[tblDauSach](
	[MaDauSach] [char](6) PRIMARY KEY,
	[MaTuaSach] [char](6) FOREIGN KEY REFERENCES tblTuaSach(MaTuaSach),
	[NgonNgu] [nvarchar](500) NOT NULL,
	[MaNXB] [char](6) NULL FOREIGN KEY REFERENCES tblNhaXuatBan(MaNXB)
)
GO 

CREATE TABLE [dbo].[tblMuon](
	[MaMuon] [char](6) PRIMARY KEY,
	[MaDocGia] [char](6) NULL FOREIGN KEY REFERENCES tblDocGia(MaDocGia),
	[MaDauSach] [char](6) NULL FOREIGN KEY REFERENCES tblDauSach(MaDauSach),
	[SoLuong] [int] NOT NULL,
	[NgayMuon] [varchar](50) NOT NULL,
	[NgayHenTra] [varchar](50) NOT NULL,
	[NgayTra] [varchar](50) NULL,
	[GhiChu] [nvarchar](500) NULL
)
GO 

INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0001', N'Võ Văn Cường', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0002', N'Nguyễn Thị Thu', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0003', N'Trần Thị Luyến', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0004', N'Nguyễn Trọng Khang', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0005', N'Ông Văn Chương', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0006', N'Đậu Thái Công', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0007', N'Ngô Nhật Dương', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0008', N'Nguyễn Văn Ân', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0009', N'Tăng Thị Thu Hòa', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0010', N'Lê Thị Anh Thư', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0011', N'Nguyễn Thị Lân', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0012', N'Hoàng Thái Khuyên', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0013', N'Võ Trần Đại', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0014', N'Phạm Như Xương', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0015', N'Ngô Bá Khá', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0016', N'Trần Chí Bằng', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0017', N'Võ Thị Thảo', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0018', N'Bùi Thị Nga', N'Nữ', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0019', N'Ngô Nhật Hoàng', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0020', N'Bùi Công Hiếu', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0021', N'Nguyễn Văn Quý', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([MaDocGia], [HoTenDG], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (N'DG0022', N'Nguyễn Văn Thành', N'Nam', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
GO

INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB001', N'Nhà Xuất Bản Giáo Dục')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB002', N'Nhà Xuất Bản Kim Đồng')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB003', N'Nhà Xuất Bản Đông Hà')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB004', N'Nhà Xuất Bản Nghị Hà')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB005', N'Nhà Xuất Bản Hữu Nghị')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB006', N'Nhà Xuất Bản Thế Giới')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB007', N'Nhà Xuất Bản Y Học')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB008', N'Nhà Xuất Bản Đại học - Đà Nẵng')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB009', N'Nhà Xuất Bản Đại học quốc gia TP.Hồ Chí Minh')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB010', N'Nhà Xuất Bản Tổng hợp TPHCM')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB011', N'Nhà Xuất Bản Tuổi trẻ')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB012', N'Nhà Xuất Bản Kim Biên')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB013', N'Nhà Xuất Bản Trí Thức')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB014', N'Nhà Xuất Bản Monokaqua ')
INSERT [dbo].[tblNhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB015', N'Nhà Xuất Bản Izli Karatelo')
GO
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0001', N'TS.Hoàng Thị Mỹ Lệ')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0002', N'Akira Mitaki')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0003', N'Phạm Thế Hùng')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0004', N'Nguyễn Du')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0005', N'TS.Nguyễn Đức Thành')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0006', N'Nhà văn Cao Tùng Bá')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0007', N'Nhà văn Robert Gando')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0008', N'Nhà Văn Monoki Htoza')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0009', N'Nhà văn Hoàng Anh Tú')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0010', N'Nhà Văn Leo Asian')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0011', N'Jenny Hoàng')
INSERT [dbo].[tblTacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG0012', N'Nhiều tác giả')
GO

INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0001', N'Sách Kinh Dị')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0002', N'Sách Ngôn Tình')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0003', N'Sách Giáo Khoa')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0004', N'Truyện tranh')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0005', N'Truyện Dân Gian')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0006', N'Sách đời sống')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0007', N'Sách kỹ năng sống')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0008', N'Sách học sinh - teens')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0009', N'Kinh tế - kinh doanh')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0010', N'Văn học - tiểu thuyết')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0011', N'từ điển')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0012', N'Truyện ngắn trong nước')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0013', N'Dân ca')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0014', N'Thơ - kịch')
INSERT [dbo].[tblTheLoai] ([MaTheLoai], [TenLoaiSach]) VALUES (N'TL0015', N'Gia đình - trẻ em')
GO

INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0001', N'Truyện tranh Shin cậu bé bút chì', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất', 2)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0002', N'Truyện dân gian Trạng Quỳnh', N'TG0004', N'TL0005', N'Là một bộ truyện gian dan do Việt Nam sản xuất', 3)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0003', N'Lập trình cơ bản C', N'TG0001', N'TL0003', N'Là một cuốc sách giáo khoa do TS.Hoàng Thị Mỹ Lệ biên soạn', 6)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0004', N'Truyện tranh CôNan Thám tử lừng danh', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất', 0)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0005', N'Truyện tranh Naruto', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất', 1)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0006', N'Truyện HerryPorter', N'TG0005', N'TL0004', N'Là một bộ truyện tranh kể về 1 vị pháp sư tài ba', 0)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0007', N'Truyện Doreamon', N'TG0006', N'TL0004', N'là một bộ truyện tranh kể về 1 con mèo máy đến từ tương lai tên là Doraemom', 4)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0008', N'Sách đời sống mới', N'TG0008', N'TL0010', N'là 1 cuốn sách nói vè đời sống inh hoạt của vị lãnh tụ vĩ đại Hồ Chí Minh', 9)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0009', N'Sách Hồ Chí Minh ông tiên sống mãi', N'TG0007', N'TL0001', N'là 1 cuốn sách ca ngợi chủ tịch Hồ Chí Minh', 3)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0010', N'Sách Tuổi trẻ đáng giá bao nhiêu', N'TG0005', N'TL0008', N'là 1 cuốn sách nói về kỹ năng sống', 0)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0011', N'Sách Đánh thức con người trong bạn', N'TG0006', N'TL0006', N'là 1 cuốn sách khơi nguồn sức sống trong bản thân mỗi người', 2)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0012', N'Sách Cafe cùng Tony ', N'TG0011', N'TL0007', N'là 1 cuốn sách chia sẽ kỹ năng sống', 0)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0013', N'Sách Thay đổi cuộc sống nhân số phận', N'TG0012', N'TL0006', N'là 1 cuống sách giúp bạn nhận thức nhiều hơn về các kỹ năng sống hằng ngày', 0)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0014', N'Sách Tôi tài giỏi bạn cũng thế', N'TG0010', N'TL0007', N'là 1 cuốn sách giúp bạn tư duy nhiều hơn trong học tập cũng như làm việc', 1)
INSERT [dbo].[tblTuaSach] ([MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (N'TS0015', N'Sách Chiến thắng con quỷ trong bạn', N'TG0007', N'TL0006', N'Là 1 cuốn sách chia sẽ các kỹ năng để chiến thắng chính bản thân mình', 4)
GO

INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0001', N'TS0001', N'Tiếng Việt', N'NXB001')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0002', N'TS0002', N'Tiếng Việt', N'NXB002')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0003', N'TS0003', N'Tiếng Việt', N'NXB003')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0004', N'TS0004', N'Tiếng Việt', N'NXB004')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0005', N'TS0004', N'Tiếng Việt', N'NXB005')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0006', N'TS0001', N'Tiếng Việt', N'NXB001')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0007', N'TS0002', N'Tiếng Việt', N'NXB002')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0008', N'TS0003', N'Tiếng Việt', N'NXB003')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0009', N'TS0004', N'Tiếng Việt', N'NXB004')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0010', N'TS0004', N'Tiếng Việt', N'NXB005')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0011', N'TS0001', N'Tiếng Việt', N'NXB001')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0012', N'TS0002', N'Tiếng Việt', N'NXB002')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0013', N'TS0003', N'Tiếng Việt', N'NXB003')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0014', N'TS0004', N'Tiếng Việt', N'NXB004')
INSERT [dbo].[tblDauSach] ([MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (N'DS0015', N'TS0004', N'Tiếng Việt', N'NXB005')
GO

INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0001', N'DG0001', N'DS0001', 1, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0002', N'DG0002', N'DS0001', 2, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0003', N'DG0003', N'DS0010', 3, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0004', N'DG0004', N'DS0011', 4, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0005', N'DG0005', N'DS0009', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0006', N'DG0006', N'DS0005', 1, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0007', N'DG0006', N'DS0001', 2, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0008', N'DG0007', N'DS0007', 3, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0009', N'DG0009', N'DS0001', 4, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0010', N'DG0008', N'DS0006', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0011', N'DG0010', N'DS0001', 1, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0012', N'DG0020', N'DS0004', 2, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0013', N'DG0015', N'DS0001', 3, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0014', N'DG0018', N'DS0003', 4, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0015', N'DG0012', N'DS0002', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0016', N'DG0019', N'DS0005', 1, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0017', N'DG0016', N'DS0004', 2, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0018', N'DG0014', N'DS0003', 3, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0019', N'DG0017', N'DS0001', 4, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([MaMuon], [MaDocGia], [MaDauSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (N'MM0020', N'DG0013', N'DS0002', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
GO


--Store procedure insert id automatically
CREATE PROCEDURE spInsert_tblDocGia
	@tenDG NVARCHAR(50),
	@gioiTinh NVARCHAR(5),
	@ngaySinh VARCHAR(20),
	@diaChi NVARCHAR(100),
	@sdt VARCHAR(11),
	@ngayDK VARCHAR(20),
	@ngayHH VARCHAR(20)
AS
BEGIN
	DECLARE @id CHAR(6);
	DECLARE @idNew CHAR(6);
	DECLARE @stt INT;
	SELECT TOP 1 @id = MaDocGia FROM tblDocGia ORDER BY MaDocGia DESC;
	SET @stt = CAST(SUBSTRING(@id, 3, LEN(@id)) AS INT) + 1;
	SET @idNew = 'DG' + FORMAT(@stt, '000#')
	INSERT INTO tblDocGia
	VALUES (@idNew, @tenDG, @gioiTinh, @ngaySinh, @diaChi, @sdt, @ngayDK, @ngayHH)
END
GO

CREATE PROCEDURE spInsert_tblTacGia
	@tenTG NVARCHAR(50)
AS
BEGIN
	DECLARE @idTG CHAR(6);
	DECLARE @idTGNew CHAR(6);
	DECLARE @sttTG INT;
	SELECT TOP 1 @idTG = MaTacGia FROM tblTacGia ORDER BY MaTacGia DESC;
	SET @sttTG = CAST(SUBSTRING(@idTG, 3, LEN(@idTG)) AS INT) + 1;
	SET @idTGNew = 'TG' + FORMAT(@sttTG, '000#')
	INSERT INTO tblTacGia
	VALUES(@idTGNew, @tenTG)
END
GO

CREATE PROCEDURE spInsert_tblTheLoai
	@tenTL NVARCHAR(50)
AS
BEGIN
	DECLARE @idTL CHAR(6);
	DECLARE @idTLNew CHAR(6);
	DECLARE @sttTL INT;
	SELECT TOP 1 @idTL = MaTheLoai FROM tblTheLoai ORDER BY MaTheLoai DESC;
	SET @sttTL = CAST(SUBSTRING(@idTL, 3, LEN(@idTL)) AS INT) + 1;
	SET @idTLNew = 'TL' + FORMAT(@sttTL, '000#')
	INSERT INTO tblTheLoai
	VALUES(@idTLNew, @tenTL)
END
GO

CREATE PROCEDURE spInsert_tblNhaXuatBan
	@tenNXB NVARCHAR(50)
AS
BEGIN
	DECLARE @idTL CHAR(6);
	DECLARE @idTLNew CHAR(6);
	DECLARE @sttTL INT;
	SELECT TOP 1 @idTL = MaNXB FROM tblNhaXuatBan ORDER BY MaNXB DESC;
	SET @sttTL = CAST(SUBSTRING(@idTL, 4, LEN(@idTL)) AS INT) + 1;
	SET @idTLNew = 'NXB' + FORMAT(@sttTL, '00#')
	INSERT INTO tblNhaXuatBan
	VALUES(@idTLNew, @tenNXB)
END
GO

CREATE PROCEDURE spInsert_tblTuaSach
	@tenTS NVARCHAR(50),
	@maTG CHAR(6),
	@maTL CHAR(6),
	@tomTat NVARCHAR(200),
	@soLuong INT
AS
BEGIN
	DECLARE @id CHAR(6);
	DECLARE @idNew CHAR(6);
	DECLARE @stt INT;
	SELECT TOP 1 @id = MaTuaSach FROM tblTuaSach ORDER BY MaTuaSach DESC;
	SET @stt = CAST(SUBSTRING(@id, 3, LEN(@id)) AS INT) + 1;
	SET @idNew = 'TS' + FORMAT(@stt, '000#')
	INSERT INTO tblTuaSach
	VALUES (@idNew, @tenTS, @maTG, @maTL, @tomTat, @soLuong)
END
GO

CREATE PROCEDURE spInsert_tblMuon
	@maDG CHAR(6),
	@maTS CHAR(6),
	@soLuong INT,
	@ngayMuon VARCHAR(20),
	@ngayHenTra VARCHAR(20),
	@ngayTra VARCHAR(20),
	@ghiChu NVARCHAR(50)
AS
BEGIN
	DECLARE @id CHAR(6);
	DECLARE @idNew CHAR(6);
	DECLARE @stt INT;
	SELECT TOP 1 @id = MaMuon FROM tblMuon ORDER BY MaMuon DESC;
	SET @stt = CAST(SUBSTRING(@id, 3, LEN(@id)) AS INT) + 1;
	SET @idNew = 'MM' + FORMAT(@stt, '000#')
	INSERT INTO tblMuon
	VALUES (@idNew, @maDG, @maTS, @soLuong, @ngayMuon, @ngayHenTra, @ngayTra, @ghiChu)
END
GO

CREATE PROCEDURE spInsert_tblDauSach
	@maTS CHAR(6),
	@ngonNgu NVARCHAR(20),
	@MaNXB CHAR(6)
AS
BEGIN
	DECLARE @idTL CHAR(6);
	DECLARE @idTLNew CHAR(6);
	DECLARE @sttTL INT;
	SELECT TOP 1 @idTL = MaDauSach FROM tblDauSach ORDER BY MaDauSach DESC;
	SET @sttTL = CAST(SUBSTRING(@idTL, 4, LEN(@idTL)) AS INT) + 1;
	SET @idTLNew = 'DS' + FORMAT(@sttTL, '000#')
	INSERT INTO tblDauSach
	VALUES(@idTLNew, @maTS, @ngonNgu, @MaNXB)
END