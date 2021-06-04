package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import dao.ThongTinMuonTraDao;
import model.ThongTinMuonTra;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ThongKePanel extends JPanel {
    public ThongTinMuonTraDao thongTinMuonTraDao = new ThongTinMuonTraDao();
	/**
	 * Create the panel.
	 */
	public ThongKePanel() {
		initUI();
	}

    private void initUI() {

        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        setLayout(null);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBounds(-16, 10, 1120, 730);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        
        add(chartPanel);
        chartPanel.setLayout(null);
    }

    private XYDataset createDataset() {

        XYSeries series1 = new XYSeries("Tỉ lệ sinh viên mượn sách theo tháng");
        series1.add(1, thongTinMuonTraDao.getQuantityByMonth("Jan"));
        series1.add(2, thongTinMuonTraDao.getQuantityByMonth("Feb"));
        series1.add(3, thongTinMuonTraDao.getQuantityByMonth("Mar"));
        series1.add(4, thongTinMuonTraDao.getQuantityByMonth("Apr"));
        series1.add(5, thongTinMuonTraDao.getQuantityByMonth("May"));
        series1.add(6, thongTinMuonTraDao.getQuantityByMonth("Jun"));
        series1.add(7, thongTinMuonTraDao.getQuantityByMonth("Jul"));
        series1.add(8, thongTinMuonTraDao.getQuantityByMonth("Aug"));
        series1.add(9, thongTinMuonTraDao.getQuantityByMonth("Sep"));
        series1.add(10, thongTinMuonTraDao.getQuantityByMonth("Oct"));
        series1.add(11, thongTinMuonTraDao.getQuantityByMonth("Nov"));
        series1.add(12, thongTinMuonTraDao.getQuantityByMonth("Dec"));
        

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);

        return dataset;
    }

    private JFreeChart createChart(final XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Tỉ lệ sinh viên mượn sách theo từng tháng",
                "Tháng",
                "Số lần mượn",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(1));
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(1));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Tỉ lệ sinh viên mượn sách theo từng tháng",
                        new Font("Serif", Font.BOLD, 25)
                )
        );

        return chart;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            ThongKePanel ex = new ThongKePanel();
            ex.setVisible(true);
        });
    }

}
