DROP DATABASE IF EXISTS HOTEL ;
CREATE DATABASE HOTEL ;
USE HOTEL;

CREATE TABLE CUSTOMER(
CUSTOMER_ID INT PRIMARY KEY,
FIRST_NAME VARCHAR(50) NOT NULL,
LAST_NAME VARCHAR(50) NOT NULL,
SUBJECT VARCHAR(50) NOT NULL,
MESSAGE VARCHAR(150) NOT NULL,
TYPE VARCHAR(50) NOT NULL
);

CREATE TABLE HOTEL_LOCATIONS(
LOCATION_ID INT PRIMARY KEY,
LOCATION_NAME VARCHAR(50) NOT NULL
);

CREATE TABLE HOTEL(
HOTEL_ID INT PRIMARY KEY,
HOTEL_NAME VARCHAR(50) NOT NULL,
LOCATION_ID INT NOT NULL REFERENCES HOTEL_LOCATIONS(LOCATION_ID),
IMAGE_LINK VARCHAR(100) 
);

CREATE TABLE ROOM_TYPE(
ROOM_ID INT PRIMARY KEY,
ROOM_TYPE VARCHAR(50) NOT NULL,
COST_PER_PERSON BIGINT NOT NULL
);

INSERT INTO `hotel`.`customer` (`CUSTOMER_ID`, `FIRST_NAME`, `LAST_NAME`, `SUBJECT`, `MESSAGE`, `TYPE`) VALUES ('1', 'John', 'Wick', 'Site Not working', 'Help! Site Not working', 'Contact');
INSERT INTO `hotel`.`customer` (`CUSTOMER_ID`, `FIRST_NAME`, `LAST_NAME`, `SUBJECT`, `MESSAGE`, `TYPE`) VALUES ('2', 'Jimmy', 'Constantine', 'Room Service', 'Best Room Service', 'Feedback');
INSERT INTO `hotel`.`customer` (`CUSTOMER_ID`, `FIRST_NAME`, `LAST_NAME`, `SUBJECT`, `MESSAGE`, `TYPE`) VALUES ('3', 'Jack', 'Sparrow', 'Refund', 'Refund is stuck', 'Contact');
INSERT INTO `hotel`.`customer` (`CUSTOMER_ID`, `FIRST_NAME`, `LAST_NAME`, `SUBJECT`, `MESSAGE`, `TYPE`) VALUES ('4', 'Peter', 'Pettigrew', 'Food Quality', 'Good quality and delicious food', 'Feedback');
INSERT INTO `hotel`.`customer` (`CUSTOMER_ID`, `FIRST_NAME`, `LAST_NAME`, `SUBJECT`, `MESSAGE`, `TYPE`) VALUES ('5', 'Bellatrix', 'Lastrange', 'Room Service', 'Exceptionally fast room service', 'Feedback');

INSERT INTO `hotel`.`hotel_locations` (`location_id`, `location_name`) VALUES ('101', 'New York');
INSERT INTO `hotel`.`hotel_locations` (`location_id`, `location_name`) VALUES ('102', 'Washington DC');
INSERT INTO `hotel`.`hotel_locations` (`location_id`, `location_name`) VALUES ('103', 'Chicago');
INSERT INTO `hotel`.`hotel_locations` (`location_id`, `location_name`) VALUES ('104', 'New Jersey');
INSERT INTO `hotel`.`hotel_locations` (`location_id`, `location_name`) VALUES ('105', 'Staton Island');

INSERT INTO `hotel`.`room_type` (`ROOM_ID`, `ROOM_TYPE`, `COST_PER_PERSON`) VALUES ('201', 'DELUXE', '2000');
INSERT INTO `hotel`.`room_type` (`ROOM_ID`, `ROOM_TYPE`, `COST_PER_PERSON`) VALUES ('202', 'PREMIUM', '5000');
INSERT INTO `hotel`.`room_type` (`ROOM_ID`, `ROOM_TYPE`, `COST_PER_PERSON`) VALUES ('203', 'ROYAL', '10000');

INSERT INTO `hotel`.`hotel` (`HOTEL_ID`, `HOTEL_NAME`, `LOCATION_ID`, `IMAGE_LINK`) VALUES ('2001', 'Holly Suites', '101', 'https://static.toiimg.com/photo/51107660.cms');
INSERT INTO `hotel`.`hotel` (`HOTEL_ID`, `HOTEL_NAME`, `LOCATION_ID`, `IMAGE_LINK`) VALUES ('2002', 'Hogwards', '102', 'https://www.princehotels.com/wp-content/uploads/2019/04/aboutslider2-1.jpg');
INSERT INTO `hotel`.`hotel` (`HOTEL_ID`, `HOTEL_NAME`, `LOCATION_ID`, `IMAGE_LINK`) VALUES ('2003', 'Ambience', '103', 'https://www.financialexpress.com/wp-content/uploads/2022/07/hotel1.jpg');
INSERT INTO `hotel`.`hotel` (`HOTEL_ID`, `HOTEL_NAME`, `LOCATION_ID`, `IMAGE_LINK`) VALUES ('2004', 'Luxury Delights', '104', 'https://www.lux-review.com/wp-content/uploads/2019/09/turkish-hotel.jpg');
INSERT INTO `hotel`.`hotel` (`HOTEL_ID`, `HOTEL_NAME`, `LOCATION_ID`, `IMAGE_LINK`) VALUES ('2005', 'Pacific Grand', '105', 'https://wedbook.in/wp-content/uploads/2022/02/Blog-Cover-Pic-3-2-1024x683.jpg');
