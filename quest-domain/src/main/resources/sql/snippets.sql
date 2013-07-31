show character set;

-- For Schemas:
SELECT default_character_set_name FROM information_schema.SCHEMATA S
WHERE schema_name = "quest";

-- For tables:
SELECT CCSA.character_set_name FROM information_schema.`TABLES` T,
       information_schema.`COLLATION_CHARACTER_SET_APPLICABILITY` CCSA
WHERE CCSA.collation_name = T.table_collation
  AND T.table_schema = "quest"
  AND T.table_name = "Regions";

-- For Columns:
SELECT character_set_name FROM information_schema.`COLUMNS` C
WHERE table_schema = "quest"
  AND table_name = "Countries"
  AND column_name = "Country";

-- changing charset
ALTER TABLE Countries
  DEFAULT CHARACTER SET utf8mb4,
  MODIFY col1 CHAR(10)
    CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  MODIFY col2 CHAR(10)
    CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL;

alter table Countries DEFAULT CHARACTER SET latin1; --utf8mb4;

