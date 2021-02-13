SET @row_number = 0;

INSERT INTO prod_08_30_20.cl_cuatm_all (
 id, 
 codul,
 denumire,
 grupa,
 ordine,
 full_code,
 prgs

)

SELECT 
 @row_number:=@row_number+1  AS id, 
 codul,
 denumire,
 grupa,
 ordine,
 full_code,
 prgs


	FROM u331875177_db2.vw_cuatm
	
	ORDER BY 
	full_CODE