package application.navigation;

/**
 * 
 * This page loader class is to return the mnumber is
 * 
 * *
 */

import java.io.IOException;

import javafx.event.ActionEvent;

public class pageloader {
	
	private String pager;
	private ActionEvent e;
	private String title;
	
	/**
	 * @return the pager
	 */
	public String getPager() {
		return pager;
	}





	/**
	 * @param pager the pager to set
	 */
	public void setPager(String pager) {
		this.pager = pager;
	}





	/**
	 * @return the e
	 */
	public ActionEvent getE() {
		return e;
	}





	/**
	 * @param e the e to set
	 */
	public void setE(ActionEvent e) {
		this.e = e;
	}





	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}





	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}





	/**
	 * @param pager
	 * @param e
	 * @param title
	 */
	public pageloader(String pager, ActionEvent e, String title) {
		super();
		this.pager = pager;
		this.e = e;
		this.title = title;
	}



	
	


}
