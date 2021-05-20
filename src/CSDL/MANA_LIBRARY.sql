USE [MANAGE_LIBRARY]
GO
/****** Object:  Table [dbo].[tblCuonSach]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblCuonSach](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaCuonSach] [char](6) NOT NULL,
	[TenCuonSach] [nvarchar](500) NOT NULL,
	[MaDauSach] [char](6) NULL,
	[TenTL] [nvarchar](300) NULL,
	[SoLuong] [int] NOT NULL,
	[TomTat] [nvarchar](500) NULL,
 CONSTRAINT [FK_CS] PRIMARY KEY CLUSTERED 
(
	[MaCuonSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblDauSach]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDauSach](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaDauSach] [char](6) NOT NULL,
	[MaTuaSach] [char](6) NULL,
	[NgonNgu] [nvarchar](500) NOT NULL,
	[MaNXB] [char](6) NULL,
 CONSTRAINT [FK_BOOK] PRIMARY KEY CLUSTERED 
(
	[MaDauSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblDocGia]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDocGia](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaDocGia] [char](6) NOT NULL,
	[HoLotDG] [nvarchar](200) NOT NULL,
	[TenDocGia] [nvarchar](200) NOT NULL,
	[GioiTinh] [char](1) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[DiaChi] [nvarchar](200) NOT NULL,
	[SoDienThoai] [varchar](11) NULL,
	[NgayDangKi] [date] NOT NULL,
	[NgayHetHanDK] [date] NULL,
 CONSTRAINT [FK_DG] PRIMARY KEY CLUSTERED 
(
	[MaDocGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblMuon]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblMuon](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaMuon] [char](6) NOT NULL,
	[MaDocGia] [char](6) NULL,
	[MaCuonSach] [char](6) NULL,
	[SoLuong] [int] NOT NULL,
	[NgayMuon] [date] NOT NULL,
	[NgayHenTra] [date] NOT NULL,
	[NgayTra] [date] NULL,
	[GhiChu] [nvarchar](500) NULL,
 CONSTRAINT [FK_MUON] PRIMARY KEY CLUSTERED 
(
	[MaMuon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblNhaXuatBan]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblNhaXuatBan](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaNXB] [char](6) NOT NULL,
	[TenNXB] [nvarchar](300) NOT NULL,
 CONSTRAINT [FK_NXB] PRIMARY KEY CLUSTERED 
(
	[MaNXB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblTacGia]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblTacGia](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaTacGia] [char](6) NOT NULL,
	[TenTacGia] [nvarchar](200) NOT NULL,
 CONSTRAINT [FK_TG] PRIMARY KEY CLUSTERED 
(
	[MaTacGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblTheLoai]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblTheLoai](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaTheLoai] [char](6) NOT NULL,
	[TenLoaiSach] [nvarchar](200) NOT NULL,
 CONSTRAINT [FK_TL] PRIMARY KEY CLUSTERED 
(
	[MaTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblTuaSach]    Script Date: 5/20/2021 7:00:47 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblTuaSach](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaTuaSach] [char](6) NOT NULL,
	[TenTuaSach] [nvarchar](500) NOT NULL,
	[MaTacGia] [char](6) NULL,
	[MaTheLoai] [char](6) NULL,
	[TomTat] [nvarchar](200) NULL,
 CONSTRAINT [FK_TS] PRIMARY KEY CLUSTERED 
(
	[MaTuaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tblCuonSach] ON 

INSERT [dbo].[tblCuonSach] ([STT], [MaCuonSach], [TenCuonSach], [MaDauSach], [TenTL], [SoLuong], [TomTat]) VALUES (3, N'CS0001', N'Truyện tranh Shin cậu bé bút chì', N'DS0001', N'Truyện Tranh', 20, N'Là một bộ truyện do Nhật Bản sản xuất')
INSERT [dbo].[tblCuonSach] ([STT], [MaCuonSach], [TenCuonSach], [MaDauSach], [TenTL], [SoLuong], [TomTat]) VALUES (4, N'CS0002', N'Truyện dân gian Trạng Quỳnh', N'DS0002', N'Truyện Dân Giam', 10, N'Là một bộ truyện gian dan do Việt Nam sản xuất')
INSERT [dbo].[tblCuonSach] ([STT], [MaCuonSach], [TenCuonSach], [MaDauSach], [TenTL], [SoLuong], [TomTat]) VALUES (5, N'CS0003', N'Lập trình cơ bản C', N'DS0003', N'Sách Giáo Khoa', 0, N'Là một cuốc sách giáo khoa do TS.Hoàng Thị Mỹ Lệ biên soạn')
INSERT [dbo].[tblCuonSach] ([STT], [MaCuonSach], [TenCuonSach], [MaDauSach], [TenTL], [SoLuong], [TomTat]) VALUES (6, N'CS0004', N'Truyện tranh CôNan Thám tử lừng danh', N'DS0004', N'Truyện tranh', 10, N'Là một bộ truyện do Nhật Bản sản xuất')
INSERT [dbo].[tblCuonSach] ([STT], [MaCuonSach], [TenCuonSach], [MaDauSach], [TenTL], [SoLuong], [TomTat]) VALUES (7, N'CS0005', N'Truyện tranh Naruto', N'DS0005', N'Truyện Tranh', 20, N'Là một bộ truyện do Nhật Bản sản xuất')
SET IDENTITY_INSERT [dbo].[tblCuonSach] OFF
GO
SET IDENTITY_INSERT [dbo].[tblDauSach] ON 

INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (2, N'DS0001', N'TS0001', N'Tiếng Việt', N'NXB001')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (3, N'DS0002', N'TS0002', N'Tiếng Việt', N'NXB002')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (4, N'DS0003', N'TS0003', N'Tiếng Việt', N'NXB003')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (5, N'DS0004', N'TS0004', N'Tiếng Việt', N'NXB004')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (6, N'DS0005', N'TS0004', N'Tiếng Việt', N'NXB005')
SET IDENTITY_INSERT [dbo].[tblDauSach] OFF
GO
SET IDENTITY_INSERT [dbo].[tblDocGia] ON 

INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (1, N'DG0001', N'Ngô Nhật', N' Dương', N'1', CAST(N'2001-01-01' AS Date), N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', CAST(N'2021-05-01' AS Date), CAST(N'2022-05-01' AS Date))
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (2, N'DG0002', N'Tăng Thị Thu', N' Hòa', N'0', CAST(N'2001-01-01' AS Date), N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', CAST(N'2021-05-01' AS Date), CAST(N'2022-05-01' AS Date))
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (3, N'DG0003', N'Đậu Thái', N'Công', N'1', CAST(N'2001-01-01' AS Date), N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', CAST(N'2021-05-01' AS Date), CAST(N'2022-05-01' AS Date))
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (4, N'DG0004', N'Nguyễn Trọng', N'Khang', N'1', CAST(N'2001-01-01' AS Date), N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', CAST(N'2021-05-01' AS Date), CAST(N'2022-05-01' AS Date))
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (5, N'DG0005', N'Ông Văn', N'Chương', N'1', CAST(N'2001-01-01' AS Date), N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', CAST(N'2021-05-01' AS Date), CAST(N'2022-05-01' AS Date))
SET IDENTITY_INSERT [dbo].[tblDocGia] OFF
GO
SET IDENTITY_INSERT [dbo].[tblMuon] ON 

INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [MaCuonSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (1, N'MM0001', N'DG0001', N'CS0001', 1, CAST(N'2021-05-12' AS Date), CAST(N'2021-06-12' AS Date), NULL, N'Ngô Nhật Dương đã ghé qua')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [MaCuonSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (2, N'MM0002', N'DG0002', N'CS0002', 2, CAST(N'2021-05-12' AS Date), CAST(N'2021-06-12' AS Date), NULL, N'Tăng Thị Thu Hòa đã ghé qua')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [MaCuonSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (3, N'MM0003', N'DG0003', N'CS0003', 3, CAST(N'2021-05-12' AS Date), CAST(N'2021-06-12' AS Date), NULL, N'Đậu Thái Công Đã ghé qua')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [MaCuonSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (4, N'MM0004', N'DG0004', N'CS0004', 4, CAST(N'2021-05-12' AS Date), CAST(N'2021-06-12' AS Date), NULL, N'Nguyễn Trọng Khang đã ghé qua')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [MaCuonSach], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (5, N'MM0005', N'DG0005', N'CS0005', 5, CAST(N'2021-05-12' AS Date), CAST(N'2021-06-12' AS Date), NULL, N'Ông Văn Chương đã ghé qua')
SET IDENTITY_INSERT [dbo].[tblMuon] OFF
GO
SET IDENTITY_INSERT [dbo].[tblNhaXuatBan] ON 

INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (1, N'NXB001', N'Nhà Xuất Bản Giáo Dục')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (2, N'NXB002', N'Nhà Xuất Bản Kim Đồng')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (3, N'NXB003', N'Nhà Xuất Bản Đông Hà')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (4, N'NXB004', N'Nhà Xuất Bản Nghị Hà')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (5, N'NXB005', N'Nhà Xuất Bản Hữu Nghị')
SET IDENTITY_INSERT [dbo].[tblNhaXuatBan] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTacGia] ON 

INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (1, N'TG0001', N'Hoàng Thị Mỹ Lệ')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (2, N'TG0002', N'Akira Mitaki')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (3, N'TG0003', N'Phạm Thế Hùng')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (4, N'TG0004', N'Nguyễn Du')
SET IDENTITY_INSERT [dbo].[tblTacGia] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTheLoai] ON 

INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (1, N'TL0001', N'Sách Kinh Dị')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (2, N'TL0002', N'Sách Ngôn Tình')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (3, N'TL0003', N'Sách Giáo Khoa')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (4, N'TL0004', N'Truyện tranh')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (5, N'TL0005', N'Truyện Dân Gian')
SET IDENTITY_INSERT [dbo].[tblTheLoai] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTuaSach] ON 

INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat]) VALUES (1, N'TS0001', N'Truyện tranh Shin cậu bé bút chì', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất')
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat]) VALUES (2, N'TS0002', N'Truyện dân gian Trạng Quỳnh', N'TG0004', N'TL0005', N'Là một bộ truyện gian dan do Việt Nam sản xuất')
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat]) VALUES (3, N'TS0003', N'Lập trình cơ bản C', N'TG0001', N'TL0003', N'Là một cuốc sách giáo khoa do TS.Hoàng Thị Mỹ Lệ biên soạn')
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat]) VALUES (4, N'TS0004', N'Truyện tranh CôNan Thám tử lừng danh', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất')
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat]) VALUES (5, N'TS0005', N'Truyện tranh Naruto', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất')
SET IDENTITY_INSERT [dbo].[tblTuaSach] OFF
GO
ALTER TABLE [dbo].[tblCuonSach]  WITH CHECK ADD  CONSTRAINT [FR_CS_DM] FOREIGN KEY([MaDauSach])
REFERENCES [dbo].[tblDauSach] ([MaDauSach])
GO
ALTER TABLE [dbo].[tblCuonSach] CHECK CONSTRAINT [FR_CS_DM]
GO
ALTER TABLE [dbo].[tblDauSach]  WITH CHECK ADD  CONSTRAINT [FR_BOOK_NXB] FOREIGN KEY([MaNXB])
REFERENCES [dbo].[tblNhaXuatBan] ([MaNXB])
GO
ALTER TABLE [dbo].[tblDauSach] CHECK CONSTRAINT [FR_BOOK_NXB]
GO
ALTER TABLE [dbo].[tblDauSach]  WITH CHECK ADD  CONSTRAINT [FR_BOOK_TS] FOREIGN KEY([MaTuaSach])
REFERENCES [dbo].[tblTuaSach] ([MaTuaSach])
GO
ALTER TABLE [dbo].[tblDauSach] CHECK CONSTRAINT [FR_BOOK_TS]
GO
ALTER TABLE [dbo].[tblMuon]  WITH CHECK ADD  CONSTRAINT [FR_MuonDG] FOREIGN KEY([MaDocGia])
REFERENCES [dbo].[tblDocGia] ([MaDocGia])
GO
ALTER TABLE [dbo].[tblMuon] CHECK CONSTRAINT [FR_MuonDG]
GO
ALTER TABLE [dbo].[tblMuon]  WITH CHECK ADD  CONSTRAINT [FR_MuonS] FOREIGN KEY([MaCuonSach])
REFERENCES [dbo].[tblCuonSach] ([MaCuonSach])
GO
ALTER TABLE [dbo].[tblMuon] CHECK CONSTRAINT [FR_MuonS]
GO
ALTER TABLE [dbo].[tblTuaSach]  WITH CHECK ADD  CONSTRAINT [FR_TS_TG] FOREIGN KEY([MaTacGia])
REFERENCES [dbo].[tblTacGia] ([MaTacGia])
GO
ALTER TABLE [dbo].[tblTuaSach] CHECK CONSTRAINT [FR_TS_TG]
GO
ALTER TABLE [dbo].[tblTuaSach]  WITH CHECK ADD  CONSTRAINT [FR_TS_TL] FOREIGN KEY([MaTheLoai])
REFERENCES [dbo].[tblTheLoai] ([MaTheLoai])
GO
ALTER TABLE [dbo].[tblTuaSach] CHECK CONSTRAINT [FR_TS_TL]
GO
ALTER TABLE [dbo].[tblCuonSach]  WITH CHECK ADD  CONSTRAINT [FR_SLgS] CHECK  (([SoLuong]>=(0)))
GO
ALTER TABLE [dbo].[tblCuonSach] CHECK CONSTRAINT [FR_SLgS]
GO
ALTER TABLE [dbo].[tblDocGia]  WITH CHECK ADD  CONSTRAINT [FC_DoB] CHECK  (([NgaySinh]<getdate()))
GO
ALTER TABLE [dbo].[tblDocGia] CHECK CONSTRAINT [FC_DoB]
GO
ALTER TABLE [dbo].[tblDocGia]  WITH CHECK ADD  CONSTRAINT [FC_GT] CHECK  (([GioiTinh]='0' OR [GioiTinh]='1'))
GO
ALTER TABLE [dbo].[tblDocGia] CHECK CONSTRAINT [FC_GT]
GO
ALTER TABLE [dbo].[tblDocGia]  WITH CHECK ADD  CONSTRAINT [FC_SDT] CHECK  (([SoDienThoai] like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]' OR [SoDienThoai] like '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'))
GO
ALTER TABLE [dbo].[tblDocGia] CHECK CONSTRAINT [FC_SDT]
GO
ALTER TABLE [dbo].[tblMuon]  WITH CHECK ADD  CONSTRAINT [FC_Slg] CHECK  (([SoLuong]>=(0)))
GO
ALTER TABLE [dbo].[tblMuon] CHECK CONSTRAINT [FC_Slg]
GO
