package webview2_runtime_container;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
	
	private Browser browser;

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.EDGE);
	}

	@Override
	public void dispose() {
		super.dispose();
		browser.dispose();
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}
}