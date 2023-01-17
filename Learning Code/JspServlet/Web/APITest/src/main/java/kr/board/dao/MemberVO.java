package kr.board.dao;

// 회원(Object) -> [아이디, 패스워드, 이름], 전화번호, 주민번호, 이메일, 주소,,,,,,,,,,
public class MemberVO {
	private String memId;
	private String memPwd;
	private String memName;

	public MemberVO() {
	}

	public MemberVO(String memId, String memPwd, String memName) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName + "]";
	}

}
