set foreign_key_checks=0;
truncate table product;
truncate table feedback;


insert into product(`id`, `currency`, `details` ,`name`, `price` )
value(110, 'SDG', 'This is Foreign Luxury sofa ', 'luxury sofa', 4500 ),
(111, 'USD', 'This is Foreign Luxury table ', 'luxury table', 6500 ),
(112, 'FRC', 'This is Foreign Luxury bench ', 'luxury bench', 8500 ),
(113, 'GHC', 'This is Foreign Luxury sofa ', 'luxury chair', 10000 );

set foreign_key_checks=1;