/**
 * 
 */
package com.whu.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author hongliang
 *
 */
public class CompanyA {
	
	public String orgName;
	public int count;
	public List<String> comments;
	
	public Set<String> branches;
	
	public Map<String,String> extra;

	/**
	 * @return the orgName
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * @param orgName the orgName to set
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the comments
	 */
	public List<String> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	/**
	 * @return the branches
	 */
	public Set<String> getBranches() {
		return branches;
	}

	/**
	 * @param branches the branches to set
	 */
	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}

	/**
	 * @return the extra
	 */
	public Map<String, String> getExtra() {
		return extra;
	}

	/**
	 * @param extra the extra to set
	 */
	public void setExtra(Map<String, String> extra) {
		this.extra = extra;
	}

	/**
	 * @param orgName
	 * @param count
	 * @param comments
	 * @param branches
	 * @param extra
	 */
	public CompanyA(String orgName, int count, List<String> comments, Set<String> branches, Map<String, String> extra) {
		super();
		this.orgName = orgName;
		this.count = count;
		this.comments = comments;
		this.branches = branches;
		this.extra = extra;
	}
	
	

}
