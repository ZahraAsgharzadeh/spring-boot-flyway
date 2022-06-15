DROP FUNCTION IF EXISTS `fnPlus`;

CREATE FUNCTION `fnPlus`(
    `first_input` BIGINT,
    `second_input` BIGINT
)
    RETURNS BIGINT
    DETERMINISTIC
BEGIN

    DECLARE `result` BIGINT;

	SELECT `first_input` + `second_input` INTO `result`;
    RETURN `result`;

END;
