package com.acquisio.basic.sql.question02;

import com.acquisio.util.dbutil.H2DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Write a query to extract all employees that are not assigned to any project.
 * -- The select should output those columns
 * -- |FirstName|LastName|DepartmentName|
 *
 * Here is the database schema to use.
 * <p>
 * employees                             projects
 * +---------------+---------+           +---------------+---------+
 * | id            | int     |<----+  +->| id            | int     |
 * | first_name    | varchar |     |  |  | title         | varchar |
 * | last_name     | varchar |     |  |  | start_date    | date    |
 * | salary        | int     |     |  |  | end_date      | date    |
 * | department_id | int     |--+  |  |  | budget        | int     |
 * +---------------+---------+  |  |  |  +---------------+---------+
 * |  |  |
 * departments                  |  |  |  employees_projects
 * +---------------+---------+  |  |  |  +---------------+---------+
 * | id            | int     |<-+  |  +--| project_id    | int     |
 * | name          | varchar |     +-----| employee_id   | int     |
 * +---------------+---------+           +---------------+---------+
 */
public class Extraction {
    public static void main(String[] args) throws SQLException {
        H2DBUtil.startDatabase();
        try {
            Extraction instance = new Extraction();
            instance.printNumberOfEmployeesPerProject();
        } finally {
            H2DBUtil.stopDatabase();
        }
    }

    private void printNumberOfEmployeesPerProject() throws SQLException {
        try (Connection conn = H2DBUtil.getConnection()) {
            // Start : For consultation only, can be removed
//            H2DBUtil.displayTableRows(conn, "projects");
//            H2DBUtil.displayTableRows(conn, "departments");
//            H2DBUtil.displayTableRows(conn, "employees");
//            H2DBUtil.displayTableRows(conn, "employees_projects");
            // End : For consultation only, can be removed

            // TODO: Insert query here
            // See requirement in this class javadoc
            // String query = "select 1 as dummyValue from dual";
            String query = "select b.first_name, b.last_name, d.name from employees b left join departments d on b.id = d.id left join " +
        			"(select b.id from projects a left join employees_projects c on c.project_id = a.id left join employees b on b.id=c.employee_id where c.employee_id not null) e where b.id <> e.id";
            
            
            ResultSet resultSet = conn.createStatement().executeQuery(query);
            H2DBUtil.displayResultSet(resultSet);

        }
    }
}
