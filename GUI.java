import javax.swing.JLabel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Label;

public class GUI {

	protected Shell shell;
	private Text txtInput;
	private Table resultsTable;

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
		
		Button feature1Button = new Button(shell, SWT.RADIO);
		feature1Button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		feature1Button.setBounds(0, 10, 91, 19);
		feature1Button.setText("Feature 1");
		
		Button feature2Button = new Button(shell, SWT.RADIO);
		feature2Button.setBounds(87, 10, 91, 19);
		feature2Button.setText("Feature 2");
		
		Button feature3Button = new Button(shell, SWT.RADIO);
		feature3Button.setBounds(175, 10, 91, 19);
		feature3Button.setText("Feature 3");
		
		Button feature4Button = new Button(shell, SWT.RADIO);
		feature4Button.setBounds(265, 10, 91, 19);
		feature4Button.setText("Feature 4");
		
		Button feature5Button = new Button(shell, SWT.RADIO);
		feature5Button.setBounds(355, 10, 89, 19);
		feature5Button.setText("Feature 5");
		
		txtInput = new Text(shell, SWT.BORDER);
		txtInput.setBounds(193, 101, 130, 29);
		
		resultsTable = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		resultsTable.setBounds(10, 139, 424, 122);
		resultsTable.setHeaderVisible(true);
		resultsTable.setLinesVisible(true);
		
		Label inputLabel = new Label(shell, SWT.NONE);
		inputLabel.setBounds(150, 108, 70, 17);
		inputLabel.setText("Input:");
		
		Label queryLabel = new Label(shell, SWT.WRAP);
		queryLabel.setBounds(10, 35, 424, 53);
		queryLabel.setText("Query Text will display HeRe");
		
		Button submitButton = new Button(shell, SWT.NONE);
		submitButton.setBounds(329, 101, 105, 29);
		submitButton.setText("Submit Query");
		submitButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Button Clicked");
				}
			});
		
	}
}
