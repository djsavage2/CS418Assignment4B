import javax.swing.JLabel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Label;

public class GUI {

	protected Shell shell;
	private Text txtInput;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
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
		shell.open();
		shell.layout();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton.setBounds(0, 10, 116, 19);
		btnRadioButton.setText("Feature 1");
		
		Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
		btnRadioButton_1.setBounds(87, 10, 116, 19);
		btnRadioButton_1.setText("Feature 2");
		
		Button btnRadioButton_2 = new Button(shell, SWT.RADIO);
		btnRadioButton_2.setBounds(175, 10, 116, 19);
		btnRadioButton_2.setText("Feature 3");
		
		Button btnRadioButton_3 = new Button(shell, SWT.RADIO);
		btnRadioButton_3.setBounds(265, 10, 116, 19);
		btnRadioButton_3.setText("Feature 4");
		
		Button btnRadioButton_4 = new Button(shell, SWT.RADIO);
		btnRadioButton_4.setBounds(355, 10, 116, 19);
		btnRadioButton_4.setText("Feature 5");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(329, 101, 105, 29);
		btnNewButton.setText("Submit Query");
		
		txtInput = new Text(shell, SWT.BORDER);
		txtInput.setBounds(193, 101, 130, 29);
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 139, 424, 122);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(150, 108, 70, 17);
		lblNewLabel.setText("Input:");
		
		Label lblNewLabel_1 = new Label(shell, SWT.WRAP);
		lblNewLabel_1.setBounds(10, 35, 424, 53);
		lblNewLabel_1.setText("Query Text will display HeRe");
		
	}
}
