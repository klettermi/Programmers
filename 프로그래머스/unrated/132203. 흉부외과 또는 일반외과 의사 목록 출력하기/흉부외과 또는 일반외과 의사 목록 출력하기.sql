SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(HIRE_YMD, 'yyyy-mm-dd')
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;