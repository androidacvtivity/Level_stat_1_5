SET @row_number = 0;

INSERT INTO cl_cuatm_all (
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


	FROM vw_cuatm
	
	ORDER BY 
	full_CODE