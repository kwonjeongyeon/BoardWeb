package com.myspring.biz.common;

import java.sql.Connection; //Ư�� �����ͺ��̽����� ����(����), SQL ���� ����ǰ� ���� ���ؽ�Ʈ ������ ����� ��ȯ
import java.sql.DriverManager; //JDBC ����̹� ��Ʈ�� �����ϱ� ���� �⺻ ����
import java.sql.PreparedStatement; //�̸� �����ϵ� SQL ���� ��Ÿ���� ��ü
import java.sql.ResultSet; //�����ͺ��̽� ��� ������ ��Ÿ���� ������ ���̺�, �Ϲ������� �����ͺ��̽��� �����ϴ� ���� �����Ͽ� ����

//�����ͺ��̽� ���� ó�� (DAO Ŭ�������� �������� ����Ͽ� connection ȹ��� ���� �۾� ó��)
public class JDBCUtil {
	public static Connection getConnection() {

		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void close(PreparedStatement stmt, Connection conn) {
		if (stmt != null) {
			try {
				if (!stmt.isClosed()) {
					stmt.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}

		if (conn != null) {
			try {
				if (!conn.isClosed()) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}

	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			try {
				if (!rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}

		if (stmt != null) {
			try {
				if (!stmt.isClosed()) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}

		if (conn != null) {
			try {
				if (!conn.isClosed()) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}

}
