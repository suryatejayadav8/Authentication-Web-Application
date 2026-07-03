-- Run this once in MySQL before starting the app
CREATE DATABASE IF NOT EXISTS fsd;
USE fsd;

CREATE TABLE IF NOT EXISTS employee (
    emp_id      VARCHAR(20)  NOT NULL PRIMARY KEY,
    emp_name    VARCHAR(100) NOT NULL,
    department  VARCHAR(100) NOT NULL
);

-- Sample data (optional)
INSERT INTO employee (emp_id, emp_name, department) VALUES
('E101', 'Vamsi Krishna', 'Training & Development'),
('E102', 'Sudha Rani', 'Computer Science'),
('E103', 'Ravi Kumar', 'Information Technology');
