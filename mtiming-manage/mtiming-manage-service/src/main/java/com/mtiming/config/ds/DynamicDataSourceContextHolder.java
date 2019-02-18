package com.mtiming.config.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DynamicDataSourceContextHolder {
	
	private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);
	

	// 列举数据源的key
	public enum DbType {
        DATASOURCE, DATASOURCETIMING
    }

    /**
     * 用于在切换数据源时保证不会被其他线程修改
     */
    private static Lock lock = new ReentrantLock();

    /**
     * 用于轮循的计数器
     */
    private static int counter = 0;

    /**
     * Maintain variable for every thread, to avoid effect other thread
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return DbType.DATASOURCE.name();
		}
	};

    /**
     * All DataSource List
     */
    public static List<String> dataSourceKeys = new ArrayList<>();

    /**
     * The constant slaveDataSourceKeys.
     */
    public static List<String> slaveDataSourceKeys = new ArrayList<>();

    /**
     * To switch DataSource
     *
     * @param key the key
     */
    public static void setDataSourceKey(String key) {
        CONTEXT_HOLDER.set(key);
    }

    public static void useMasterDataSource() {
        CONTEXT_HOLDER.set(DbType.DATASOURCE.name());
    }
    public static void useTimingDataSource() {
        CONTEXT_HOLDER.set(DbType.DATASOURCETIMING.name());
    }


    /**
     * Get current DataSource
     *
     * @return data source key
     */
    public static String getDataSourceKey() {
        return CONTEXT_HOLDER.get();
    }

    /**
     * To set DataSource as default
     */
    public static void clearDataSourceKey() {
        CONTEXT_HOLDER.remove();
    }

}
