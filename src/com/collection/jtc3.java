package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class jtc3 {
		private int sid;//P.K
		private String sname;
		private String dob;
		private String qualification;
		private String[] courses;
		private List<String>emails;
		private List<Integer>marks;
		private Set<Long>phones;
		public jtc3() {
			super();
			// TODO Auto-generated constructor stub
		}
		public jtc3(String sname,String dob, String qualifaction,
		String[]courses, List<String>emails,List<Integer>marks,
		Set<Long>phones) {
		this.sname = sname;
		this.dob =dob;
		this.qualification=qualification;
		this.courses = courses;
		this.emails =emails;
		this.marks=marks;
		this.phones=phones;
	
}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String[] getCourses() {
			return courses;
		}
		public void setCourses(String[] courses) {
			this.courses = courses;
		}
		public List<String> getEmails() {
			return emails;
		}
		public void setEmails(List<String> emails) {
			this.emails = emails;
		}
		public List<Integer> getMarks() {
			return marks;
		}
		public void setMarks(List<Integer> marks) {
			this.marks = marks;
		}
		public Set<Long> getPhones() {
			return phones;
		}
		public void setPhones(Set<Long> phones) {
			this.phones = phones;
		}
		
}
