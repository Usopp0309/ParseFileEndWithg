package com.hdtd.service;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hdtd.dao.GparseDao;
import com.hdtd.domain.ACLine;
import com.hdtd.domain.Bus;
import com.hdtd.domain.CBreaker;
import com.hdtd.domain.Disconnector;
import com.hdtd.domain.Gt;
import com.hdtd.domain.Pdtransformer;
import com.hdtd.domain.zf;
import com.hdtd.mapper.ACLineMapper;
import com.hdtd.mapper.BusMapper;
import com.hdtd.mapper.CBreakerMapper;
import com.hdtd.mapper.DisconnectorMapper;
import com.hdtd.mapper.GtMapper;
import com.hdtd.mapper.PdtransformerMapper;
import com.hdtd.mapper.zfMapper;

public class GparseServicesssss {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CBreakerMapper basicMapper = context.getBean(CBreakerMapper.class);
		
//		File file = new File("gfile/TM.10kV城九513线路_10kV.dx.pic.g.xml");
		File directory = new File("E:/华电通达/eg文件解析/要解析的9个文件");
		File[] files = directory.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			
			
//			new GparseServicesssss<ACLine>().parse(context, file, ACLine.class, ACLineMapper.class);
//			
//			new GparseServicesssss<Bus>().parse(context, file, Bus.class, BusMapper.class);
//			
//			new GparseServicesssss<CBreaker>().parse(context, file, CBreaker.class, CBreakerMapper.class);
//			
//			new GparseServicesssss<Disconnector>().parse(context, file, Disconnector.class, DisconnectorMapper.class);
//			
//			new GparseServicesssss<Gt>().parse(context, file, Gt.class, GtMapper.class);
//			
//			new GparseServicesssss<Pdtransformer>().parse(context, file, Pdtransformer.class, PdtransformerMapper.class);
//			
//			new GparseServicesssss<zf>().parse(context, file, zf.class, zfMapper.class);
		}
		
//		new GparseService<ACLine>().parse(context, file, ACLine.class, ACLineMapper.class);
//		
//		new GparseService<Bus>().parse(context, file, Bus.class, BusMapper.class);
//		
//		new GparseService<CBreaker>().parse(context, file, CBreaker.class, CBreakerMapper.class);
//		
//		new GparseService<Disconnector>().parse(context, file, Disconnector.class, DisconnectorMapper.class);
//		
//		new GparseService<Gt>().parse(context, file, Gt.class, GtMapper.class);
//		
//		new GparseService<Pdtransformer>().parse(context, file, Pdtransformer.class, PdtransformerMapper.class);
//		
//		new GparseService<zf>().parse(context, file, zf.class, zfMapper.class);
		
		
		
	}
}
