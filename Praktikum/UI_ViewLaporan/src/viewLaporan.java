import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Table;

public class viewLaporan {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			viewLaporan window = new viewLaporan();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(718, 500);
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmDashboard = new MenuItem(menu, SWT.NONE);
		mntmDashboard.setText("Dashboard");
		
		MenuItem mntmLaporan = new MenuItem(menu, SWT.NONE);
		mntmLaporan.setText("Laporan");
		
		Composite composite = new Composite(shell, SWT.BORDER);
		composite.setBounds(24, 24, 206, 97);
		
		Label lblTotalPemasukan = new Label(composite, SWT.NONE);
		lblTotalPemasukan.setBounds(10, 10, 107, 15);
		lblTotalPemasukan.setText("Total Pemasukan");
		
		Label lblIdr = new Label(composite, SWT.NONE);
		lblIdr.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
		lblIdr.setBounds(10, 31, 149, 33);
		lblIdr.setText("IDR 99,999,999");
		
		Composite composite_1 = new Composite(shell, SWT.BORDER);
		composite_1.setBounds(250, 24, 206, 97);
		
		Label lblTotalPemasukan_1 = new Label(composite_1, SWT.NONE);
		lblTotalPemasukan_1.setText("Total Tiket Terjual");
		lblTotalPemasukan_1.setBounds(10, 10, 107, 15);
		
		Label lblIdr_1 = new Label(composite_1, SWT.NONE);
		lblIdr_1.setText("120,000");
		lblIdr_1.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
		lblIdr_1.setBounds(10, 31, 149, 33);
		
		Composite composite_1_1 = new Composite(shell, SWT.BORDER);
		composite_1_1.setBounds(475, 24, 206, 97);
		
		Label lblTotalPemasukan_1_1 = new Label(composite_1_1, SWT.NONE);
		lblTotalPemasukan_1_1.setText("Total Pengunjung");
		lblTotalPemasukan_1_1.setBounds(10, 10, 107, 15);
		
		Label lblIdr_1_1 = new Label(composite_1_1, SWT.NONE);
		lblIdr_1_1.setText("3,901,000");
		lblIdr_1_1.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD));
		lblIdr_1_1.setBounds(10, 31, 149, 33);
		
		Composite composite_2 = new Composite(shell, SWT.BORDER);
		composite_2.setBounds(21, 142, 326, 289);
		
		Label lblStatistikLaporan = new Label(composite_2, SWT.NONE);
		lblStatistikLaporan.setBounds(10, 10, 98, 15);
		lblStatistikLaporan.setText("Statistik Laporan");
		
		table = formToolkit.createTable(composite_2, SWT.NONE);
		table.setBounds(10, 31, 302, 244);
		formToolkit.paintBordersFor(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		Composite composite_2_1 = new Composite(shell, SWT.BORDER);
		composite_2_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		composite_2_1.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		composite_2_1.setBounds(355, 142, 326, 289);
		
		Label label = new Label(composite_2_1, SWT.NONE);
		label.setLocation(10, 18);
		label.setSize(302, 15);
		label.setText("____________________________________________________________________________");
		
		Label lblTransaksiTerbaru = new Label(composite_2_1, SWT.NONE);
		lblTransaksiTerbaru.setBounds(10, 10, 96, 15);
		lblTransaksiTerbaru.setText("Transaksi Terbaru");
		
		Composite composite_3 = new Composite(composite_2_1, SWT.NONE);
		composite_3.setBounds(10, 31, 302, 43);
		
		Label lblPadaTgl = new Label(composite_2_1, SWT.NONE);
		lblPadaTgl.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		lblPadaTgl.setBounds(10, 57, 120, 15);
		lblPadaTgl.setText("pada tgl 21 April 2020");
		
		Label lblIdr_2 = new Label(composite_2_1, SWT.NONE);
		lblIdr_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblIdr_2.setBounds(156, 39, 55, 15);
		lblIdr_2.setText("IDR 75,000");
		
		Label lblConfirmed = new Label(composite_2_1, SWT.NONE);
		lblConfirmed.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblConfirmed.setBounds(250, 39, 62, 15);
		lblConfirmed.setText("Confirmed");
		
		Label lblRaihanNugrahaS = new Label(composite_2_1, SWT.NONE);
		lblRaihanNugrahaS.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblRaihanNugrahaS.setBounds(10, 39, 140, 15);
		lblRaihanNugrahaS.setText("Raihan Nugraha S");
		
		Label lblPadaTgl_1 = new Label(composite_2_1, SWT.NONE);
		lblPadaTgl_1.setText("pada tgl 21 April 2020");
		lblPadaTgl_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		lblPadaTgl_1.setBounds(10, 98, 120, 15);
		
		Label lblIdr_2_1 = new Label(composite_2_1, SWT.NONE);
		lblIdr_2_1.setText("IDR 75,000");
		lblIdr_2_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblIdr_2_1.setBounds(156, 80, 55, 15);
		
		Label lblConfirmed_1 = new Label(composite_2_1, SWT.NONE);
		lblConfirmed_1.setText("Confirmed");
		lblConfirmed_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblConfirmed_1.setBounds(250, 80, 62, 15);
		
		Label lblRaihanNugrahaS_1 = new Label(composite_2_1, SWT.NONE);
		lblRaihanNugrahaS_1.setText("Raihan Nugraha S");
		lblRaihanNugrahaS_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblRaihanNugrahaS_1.setBounds(10, 80, 140, 15);
		
		Label lblPadaTgl_2 = new Label(composite_2_1, SWT.NONE);
		lblPadaTgl_2.setText("pada tgl 21 April 2020");
		lblPadaTgl_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		lblPadaTgl_2.setBounds(10, 137, 120, 15);
		
		Label lblIdr_2_2 = new Label(composite_2_1, SWT.NONE);
		lblIdr_2_2.setText("IDR 75,000");
		lblIdr_2_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblIdr_2_2.setBounds(156, 119, 55, 15);
		
		Label lblConfirmed_2 = new Label(composite_2_1, SWT.NONE);
		lblConfirmed_2.setText("Confirmed");
		lblConfirmed_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblConfirmed_2.setBounds(250, 119, 62, 15);
		
		Label lblRaihanNugrahaS_2 = new Label(composite_2_1, SWT.NONE);
		lblRaihanNugrahaS_2.setText("Raihan Nugraha S");
		lblRaihanNugrahaS_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblRaihanNugrahaS_2.setBounds(10, 119, 140, 15);
		
		Label lblPadaTgl_3 = new Label(composite_2_1, SWT.NONE);
		lblPadaTgl_3.setText("pada tgl 21 April 2020");
		lblPadaTgl_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BORDER));
		lblPadaTgl_3.setBounds(10, 176, 120, 15);
		
		Label lblIdr_2_3 = new Label(composite_2_1, SWT.NONE);
		lblIdr_2_3.setText("IDR 75,000");
		lblIdr_2_3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblIdr_2_3.setBounds(156, 158, 55, 15);
		
		Label lblConfirmed_3 = new Label(composite_2_1, SWT.NONE);
		lblConfirmed_3.setText("Confirmed");
		lblConfirmed_3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblConfirmed_3.setBounds(250, 158, 62, 15);
		
		Label lblRaihanNugrahaS_3 = new Label(composite_2_1, SWT.NONE);
		lblRaihanNugrahaS_3.setText("Raihan Nugraha S");
		lblRaihanNugrahaS_3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblRaihanNugrahaS_3.setBounds(10, 158, 140, 15);

	}
}
