/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class BackupA extends Thread{
	private DBTools dbtools;

	/**
	 * @param dbtools
	 */
	public BackupA(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		dbtools.backupA();
	}
	
}
