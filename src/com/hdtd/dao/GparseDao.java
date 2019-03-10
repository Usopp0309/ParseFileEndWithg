package com.hdtd.dao;

import java.io.File;
import java.util.List;

import org.springframework.context.ApplicationContext;

import com.hdtd.domain.ACLine;
import com.hdtd.domain.BasicPojo;
import com.hdtd.mapper.ACLineMapper;

import tk.mybatis.mapper.common.Mapper;

public class GparseDao<T extends BasicPojo> {
	
	public void parse(ApplicationContext context,File file,Class pojoClazz,Class mapperClazz) throws Exception{
		Mapper mapper = context.getBean(mapperClazz);
		GparseXml<T> acLineService = new GparseXml<T>();
		List<T> aclist = acLineService.parseService(file, pojoClazz);
		for (T t : aclist) {
			mapper.insertSelective(t);
		}
//		for (ACLine acLine : aclist) {
////			System.out.println(acLine);
//			acLineMapper.insertSelective(acLine);
////			acLineMapper.insert(acLine);
//		}
	}
	
}
