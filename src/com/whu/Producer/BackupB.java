/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class BackupB extends Thread{
	
	private DBTools dbtools;

	/**
	 * @param dbtools
	 */
	public BackupB(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		dbtools.backupB();
	}
	
	
}
