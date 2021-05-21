CREATE DATABASE [MANAGE_LIBRARY] 
GO
USE [MANAGE_LIBRARY]
GO
/****** Object:  Table [dbo].[tblDauSach]    Script Date: 5/21/2021 12:15:11 PM ******/
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
/****** Object:  Table [dbo].[tblDocGia]    Script Date: 5/21/2021 12:15:11 PM ******/
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
	[NgaySinh] [varchar](50) NOT NULL,
	[DiaChi] [nvarchar](200) NOT NULL,
	[SoDienThoai] [varchar](11) NULL,
	[NgayDangKi] [varchar](50) NOT NULL,
	[NgayHetHanDK] [varchar](50) NULL,
 CONSTRAINT [FK_DG] PRIMARY KEY CLUSTERED 
(
	[MaDocGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblMuon]    Script Date: 5/21/2021 12:15:11 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblMuon](
	[STT] [int] IDENTITY(1,1) NOT NULL,
	[MaMuon] [char](6) NOT NULL,
	[MaDocGia] [char](6) NULL,
	[SoLuong] [int] NOT NULL,
	[NgayMuon] [varchar](50) NOT NULL,
	[NgayHenTra] [varchar](50) NOT NULL,
	[NgayTra] [varchar](50) NULL,
	[GhiChu] [nvarchar](500) NULL,
 CONSTRAINT [FK_MUON] PRIMARY KEY CLUSTERED 
(
	[MaMuon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblNhaXuatBan]    Script Date: 5/21/2021 12:15:11 PM ******/
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
/****** Object:  Table [dbo].[tblTacGia]    Script Date: 5/21/2021 12:15:11 PM ******/
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
/****** Object:  Table [dbo].[tblTheLoai]    Script Date: 5/21/2021 12:15:11 PM ******/
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
/****** Object:  Table [dbo].[tblTuaSach]    Script Date: 5/21/2021 12:15:11 PM ******/
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
	[SoLuong] [int] NULL,
 CONSTRAINT [FK_TS] PRIMARY KEY CLUSTERED 
(
	[MaTuaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tblDauSach] ON 

INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (2, N'DS0001', N'TS0001', N'Tiếng Việt', N'NXB001')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (3, N'DS0002', N'TS0002', N'Tiếng Việt', N'NXB002')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (4, N'DS0003', N'TS0003', N'Tiếng Việt', N'NXB003')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (5, N'DS0004', N'TS0004', N'Tiếng Việt', N'NXB004')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (6, N'DS0005', N'TS0004', N'Tiếng Việt', N'NXB005')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (7, N'DS0006', N'TS0001', N'Tiếng Việt', N'NXB001')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (8, N'DS0007', N'TS0002', N'Tiếng Việt', N'NXB002')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (9, N'DS0008', N'TS0003', N'Tiếng Việt', N'NXB003')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (10, N'DS0009', N'TS0004', N'Tiếng Việt', N'NXB004')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (11, N'DS0010', N'TS0004', N'Tiếng Việt', N'NXB005')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (12, N'DS0011', N'TS0001', N'Tiếng Việt', N'NXB001')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (13, N'DS0012', N'TS0002', N'Tiếng Việt', N'NXB002')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (14, N'DS0013', N'TS0003', N'Tiếng Việt', N'NXB003')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (15, N'DS0014', N'TS0004', N'Tiếng Việt', N'NXB004')
INSERT [dbo].[tblDauSach] ([STT], [MaDauSach], [MaTuaSach], [NgonNgu], [MaNXB]) VALUES (16, N'DS0015', N'TS0004', N'Tiếng Việt', N'NXB005')
SET IDENTITY_INSERT [dbo].[tblDauSach] OFF
GO
SET IDENTITY_INSERT [dbo].[tblDocGia] ON 

INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (1, N'DG0001', N'Ngô Nhật', N' Dương', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (2, N'DG0002', N'Tăng Thị Thu', N' Hòa', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (3, N'DG0003', N'Đậu Thái', N'Công', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (4, N'DG0004', N'Nguyễn Trọng', N'Khang', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (5, N'DG0005', N'Ông Văn', N'Chương', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (7, N'DG0006', N'Nguyễn Văn', N'Ân', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (8, N'DG0007', N'Trần Thị ', N'Luyến', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (9, N'DG0008', N'Nguyễn Thị', N'Thu', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (10, N'DG0009', N'Võ Văn', N'Cường', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (11, N'DG0010', N'Bùi Công', N'Hiếu', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (22, N'DG0011', N'Ngô Nhật', N'Hoàng', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (23, N'DG0012', N'Bùi Thị', N'Nga', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (24, N'DG0013', N'Võ Thị', N'Thảo', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (25, N'DG0014', N'Trần Chí', N'Bằng', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (26, N'DG0015', N'Ngô Bá', N'Khá', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (27, N'DG0016', N'Phạm Như', N'Xương', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (28, N'DG0017', N'Võ Trần', N'Đại', N'1', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (29, N'DG0018', N'Hoàng Thái', N'Khuyên', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (30, N'DG0019', N'Nguyễn Thị', N'Lân', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
INSERT [dbo].[tblDocGia] ([STT], [MaDocGia], [HoLotDG], [TenDocGia], [GioiTinh], [NgaySinh], [DiaChi], [SoDienThoai], [NgayDangKi], [NgayHetHanDK]) VALUES (31, N'DG0020', N'Lê Thị Anh ', N'Thư', N'0', N'July 23, 2001', N'Số 01 đường ABC Phường Thanh Khuê', N'0123456789', N'May 12, 2001', N'June 30, 2001')
SET IDENTITY_INSERT [dbo].[tblDocGia] OFF
GO
SET IDENTITY_INSERT [dbo].[tblMuon] ON 

INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (1, N'MM0001', N'DG0001', 1, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (2, N'MM0002', N'DG0002', 2, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (3, N'MM0003', N'DG0003', 3, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (4, N'MM0004', N'DG0004', 4, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (5, N'MM0005', N'DG0005', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (6, N'MM0006', N'DG0006', 1, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (7, N'MM0007', N'DG0006', 2, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (8, N'MM0008', N'DG0007', 3, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (9, N'MM0009', N'DG0009', 4, N'April 15, 2001', N'August 20, 2001', N'August 20, 2001', N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (10, N'MM0010', N'DG0008', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (11, N'MM0011', N'DG0010', 1, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (12, N'MM0012', N'DG0020', 2, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (13, N'MM0013', N'DG0015', 3, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (14, N'MM0014', N'DG0018', 4, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (15, N'MM0015', N'DG0012', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (17, N'MM0016', N'DG0019', 1, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (18, N'MM0017', N'DG0016', 2, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (19, N'MM0018', N'DG0014', 3, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (20, N'MM0019', N'DG0017', 4, N'April 15, 2001', N'August 20, 2001', NULL, N'')
INSERT [dbo].[tblMuon] ([STT], [MaMuon], [MaDocGia], [SoLuong], [NgayMuon], [NgayHenTra], [NgayTra], [GhiChu]) VALUES (21, N'MM0020', N'DG0013', 5, N'April 15, 2001', N'August 20, 2001', NULL, N'')
SET IDENTITY_INSERT [dbo].[tblMuon] OFF
GO
SET IDENTITY_INSERT [dbo].[tblNhaXuatBan] ON 

INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (1, N'NXB001', N'Nhà Xuất Bản Giáo Dục')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (2, N'NXB002', N'Nhà Xuất Bản Kim Đồng')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (3, N'NXB003', N'Nhà Xuất Bản Đông Hà')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (4, N'NXB004', N'Nhà Xuất Bản Nghị Hà')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (5, N'NXB005', N'Nhà Xuất Bản Hữu Nghị')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (7, N'NXB006', N'Nhà Xuất Bản Thế Giới')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (8, N'NXB007', N'Nhà Xuất Bản Y Học')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (9, N'NXB008', N'Nhà Xuất Bản Đại học - Đà Nẵng')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (10, N'NXB009', N'Nhà Xuất Bản Đại học quốc gia TP.Hồ Chí Minh')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (11, N'NXB010', N'Nhà Xuất Bản Tổng hợp TPHCM')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (12, N'NXB011', N'Nhà Xuất Bản Tuổi trẻ')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (13, N'NXB012', N'Nhà Xuất Bản Kim Biên')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (14, N'NXB013', N'Nhà Xuất Bản Trí Thức')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (15, N'NXB014', N'Nhà Xuất Bản Monokaqua ')
INSERT [dbo].[tblNhaXuatBan] ([STT], [MaNXB], [TenNXB]) VALUES (16, N'NXB015', N'Nhà Xuất Bản Izli Karatelo')
SET IDENTITY_INSERT [dbo].[tblNhaXuatBan] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTacGia] ON 

INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (1, N'TG0001', N'TS.Hoàng Thị Mỹ Lệ')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (2, N'TG0002', N'Akira Mitaki')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (3, N'TG0003', N'Phạm Thế Hùng')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (4, N'TG0004', N'Nguyễn Du')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (6, N'TG0005', N'TS.Nguyễn Đức Thành')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (7, N'TG0006', N'Nhà văn Cao Tùng Bá')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (8, N'TG0007', N'Nhà văn Robert Gando')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (9, N'TG0008', N'Nhà Văn Monoki Htoza')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (10, N'TG0009', N'Nhà văn Hoàng Anh Tú')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (11, N'TG0010', N'Nhà Văn Leo Asian')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (12, N'TG0011', N'Jenny Hoàng')
INSERT [dbo].[tblTacGia] ([STT], [MaTacGia], [TenTacGia]) VALUES (13, N'TG0012', N'Nhiều tác giả')
SET IDENTITY_INSERT [dbo].[tblTacGia] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTheLoai] ON 

INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (1, N'TL0001', N'Sách Kinh Dị')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (2, N'TL0002', N'Sách Ngôn Tình')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (3, N'TL0003', N'Sách Giáo Khoa')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (4, N'TL0004', N'Truyện tranh')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (5, N'TL0005', N'Truyện Dân Gian')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (7, N'TL0006', N'Sách đời sống')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (8, N'TL0007', N'Sách kỹ năng sống')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (9, N'TL0008', N'Sách học sinh - teens')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (10, N'TL0009', N'Kinh tế - kinh doanh')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (11, N'TL0010', N'Văn học - tiểu thuyết')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (12, N'TL0011', N'từ điển')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (13, N'TL0012', N'Truyện ngắn trong nước')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (14, N'TL0013', N'Dân ca')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (15, N'TL0014', N'Thơ - kịch')
INSERT [dbo].[tblTheLoai] ([STT], [MaTheLoai], [TenLoaiSach]) VALUES (16, N'TL0015', N'Gia đình - trẻ em')
SET IDENTITY_INSERT [dbo].[tblTheLoai] OFF
GO
SET IDENTITY_INSERT [dbo].[tblTuaSach] ON 

INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (1, N'TS0001', N'Truyện tranh Shin cậu bé bút chì', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất', 2)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (2, N'TS0002', N'Truyện dân gian Trạng Quỳnh', N'TG0004', N'TL0005', N'Là một bộ truyện gian dan do Việt Nam sản xuất', 3)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (3, N'TS0003', N'Lập trình cơ bản C', N'TG0001', N'TL0003', N'Là một cuốc sách giáo khoa do TS.Hoàng Thị Mỹ Lệ biên soạn', 6)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (4, N'TS0004', N'Truyện tranh CôNan Thám tử lừng danh', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất', 0)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (5, N'TS0005', N'Truyện tranh Naruto', N'TG0002', N'TL0004', N'Là một bộ truyện do Nhật Bản sản xuất', 1)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (7, N'TS0006', N'Truyện HerryPorter', N'TG0005', N'TL0004', N'Là một bộ truyện tranh kể về 1 vị pháp sư tài ba', 0)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (8, N'TS0007', N'Truyện Doreamon', N'TG0006', N'TL0004', N'là một bộ truyện tranh kể về 1 con mèo máy đến từ tương lai tên là Doraemom', 4)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (9, N'TS0008', N'Sách đời sống mới', N'TG0008', N'TL0010', N'là 1 cuốn sách nói vè đời sống inh hoạt của vị lãnh tụ vĩ đại Hồ Chí Minh', 9)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (10, N'TS0009', N'Sách Hồ Chí Minh ông tiên sống mãi', N'TG0007', N'TL0001', N'là 1 cuốn sách ca ngợi chủ tịch Hồ Chí Minh', 3)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (11, N'TS0010', N'Sách Tuổi trẻ đáng giá bao nhiêu', N'TG0005', N'TL0008', N'là 1 cuốn sách nói về kỹ năng sống', 0)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (12, N'TS0011', N'Sách Đánh thức con người trong bạn', N'TG0006', N'TL0006', N'là 1 cuốn sách khơi nguồn sức sống trong bản thân mỗi người', 2)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (13, N'TS0012', N'Sách Cafe cùng Tony ', N'TG0011', N'TL0007', N'là 1 cuốn sách chia sẽ kỹ năng sống', 0)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (14, N'TS0013', N'Sách Thay đổi cuộc sống nhân số phận', N'TG0012', N'TL0006', N'là 1 cuống sách giúp bạn nhận thức nhiều hơn về các kỹ năng sống hằng ngày', 0)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (15, N'TS0014', N'Sách Tôi tài giỏi bạn cũng thế', N'TG0010', N'TL0007', N'là 1 cuốn sách giúp bạn tư duy nhiều hơn trong học tập cũng như làm việc', 1)
INSERT [dbo].[tblTuaSach] ([STT], [MaTuaSach], [TenTuaSach], [MaTacGia], [MaTheLoai], [TomTat], [SoLuong]) VALUES (16, N'TS0015', N'Sách Chiến thắng con quỷ trong bạn', N'TG0007', N'TL0006', N'Là 1 cuốn sách chia sẽ các kỹ năng để chiến thắng chính bản thân mình', 4)
SET IDENTITY_INSERT [dbo].[tblTuaSach] OFF
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
