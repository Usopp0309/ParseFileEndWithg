package com.hdtd.service;

import java.io.File;
import java.io.FileFilter;

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

public class GparseService {
	// public static void main(String[] args) throws Exception {
	public void gparseFromDirectory(ApplicationContext context, File directory) throws Exception {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// CBreakerMapper basicMapper = context.getBean(CBreakerMapper.class);

		// File file = new File("gfile/TM.10kV城九513线路_10kV.dx.pic.g.xml");
		// File directory = new File("E:/华电通达/eg文件解析/要解析的9个文件");
//		 File[] files = directory.listFiles();
		File[] files = directory.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				boolean flag = pathname.getName().endsWith(".g");
				return flag;
			}
		});
//		
		for (int i = 0; i < files.length; i++) {
			File file = files[i];

			new GparseDao<ACLine>().parse(context, file, ACLine.class, ACLineMapper.class);

			new GparseDao<Bus>().parse(context, file, Bus.class, BusMapper.class);

			new GparseDao<CBreaker>().parse(context, file, CBreaker.class, CBreakerMapper.class);

			new GparseDao<Disconnector>().parse(context, file, Disconnector.class, DisconnectorMapper.class);

			new GparseDao<Gt>().parse(context, file, Gt.class, GtMapper.class);

			new GparseDao<Pdtransformer>().parse(context, file, Pdtransformer.class, PdtransformerMapper.class);

			new GparseDao<zf>().parse(context, file, zf.class, zfMapper.class);
		}

		// new GparseService<ACLine>().parse(context, file, ACLine.class,
		// ACLineMapper.class);
		//
		// new GparseService<Bus>().parse(context, file, Bus.class,
		// BusMapper.class);
		//
		// new GparseService<CBreaker>().parse(context, file, CBreaker.class,
		// CBreakerMapper.class);
		//
		// new GparseService<Disconnector>().parse(context, file,
		// Disconnector.class, DisconnectorMapper.class);
		//
		// new GparseService<Gt>().parse(context, file, Gt.class,
		// GtMapper.class);
		//
		// new GparseService<Pdtransformer>().parse(context, file,
		// Pdtransformer.class, PdtransformerMapper.class);
		//
		// new GparseService<zf>().parse(context, file, zf.class,
		// zfMapper.class);

	}

	public void gparseFromFile(ApplicationContext context, File file) throws Exception {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// CBreakerMapper basicMapper = context.getBean(CBreakerMapper.class);

		// File file = new File("gfile/TM.10kV城九513线路_10kV.dx.pic.g.xml");
		// File directory = new File("E:/华电通达/eg文件解析/要解析的9个文件");

		new GparseDao<ACLine>().parse(context, file, ACLine.class, ACLineMapper.class);

		new GparseDao<Bus>().parse(context, file, Bus.class, BusMapper.class);

		new GparseDao<CBreaker>().parse(context, file, CBreaker.class, CBreakerMapper.class);

		new GparseDao<Disconnector>().parse(context, file, Disconnector.class, DisconnectorMapper.class);

		new GparseDao<Gt>().parse(context, file, Gt.class, GtMapper.class);

		new GparseDao<Pdtransformer>().parse(context, file, Pdtransformer.class, PdtransformerMapper.class);

		new GparseDao<zf>().parse(context, file, zf.class, zfMapper.class);

	}
}
