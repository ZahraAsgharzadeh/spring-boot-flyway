DROP PROCEDURE IF EXISTS `spGetAllPlus`;

CREATE PROCEDURE `spGetAllPlus` ()
BEGIN

    SELECT
    m.id AS 'id',
    m.first_input AS 'firstInput',
    m.second_input AS 'secondInput',
    m.plus AS 'plus'
    FROM `math` m
    WHERE m.plus != 0
    ORDER BY `id` DESC
    LIMIT 10;

END;
