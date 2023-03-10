-- -----------------------------------------------------
-- Schema contacts
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS contacts DEFAULT CHARACTER SET utf8 ;
USE contacts ;

-- -----------------------------------------------------
-- Table contact
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS contact (
  con_id INT NOT NULL AUTO_INCREMENT,
  con_full_name VARCHAR(20) NOT NULL,
  con_phone_number VARCHAR(20) NOT NULL,
  con_email VARCHAR(30) NOT NULL,
  con_birth_date DATE NOT NULL,
  con_deleted_at TIMESTAMP NULL,
  PRIMARY KEY (con_id)
  )ENGINE = InnoDB;