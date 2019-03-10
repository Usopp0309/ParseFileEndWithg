package com.hdtd.service;

import java.io.File;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hdtd.dao.GparseXml;
import com.hdtd.domain.ACLine;
import com.hdtd.domain.CBreaker;
import com.hdtd.mapper.ACLineMapper;
import com.hdtd.mapper.CBreakerMapper;

import tk.mybatis.mapper.common.Mapper;

public class GparseMain2222 {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CBreakerMapper basicMapper = context.getBean(CBreakerMapper.class);
		
		File file = new File("gfile/TM.10kV³Ç¾Å513ÏßÂ·_10kV.dx.pic.g.xml");
//		GparseService<CBreaker> service = new GparseService<CBreaker>();
//		List<CBreaker> list = service.parseService(file,CBreaker.class);
//		for (CBreaker cBreaker : list) {
//			System.err.println(cBreaker);
//		}
		
		Mapper acLineMapper = context.getBean(ACLineMapper.class);
		GparseXml<ACLine> acLineService = new GparseXml<ACLine>();
		List<ACLine> aclist = acLineService.parseService(file, ACLine.class);
		for (ACLine acLine : aclist) {
//			System.out.println(acLine);
			acLineMapper.insertSelective(acLine);
//			acLineMapper.insert(acLine);
		}
	}
}
