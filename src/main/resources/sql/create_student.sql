CREATE TABLE `ebdb`.`student` (
  `studentid` BIGINT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `age` INT NULL,
  `contact` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`studentid`));