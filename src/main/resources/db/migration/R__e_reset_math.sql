DROP EVENT IF EXISTS `eResetMath`;

CREATE EVENT `eResetMath`
ON SCHEDULE EVERY 15 MINUTE STARTS '2022-06-13 00:01:00' ON
COMPLETION NOT PRESERVE ENABLE DO

    TRUNCATE TABLE `math`;