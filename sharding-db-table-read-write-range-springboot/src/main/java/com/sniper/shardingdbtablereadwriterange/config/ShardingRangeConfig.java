package com.sniper.shardingdbtablereadwriterange.config;

import lombok.Data;

import java.util.List;

@Data
public class ShardingRangeConfig {

	private long start;
	
	private long end;
	
	private List<String> datasourceList;


}
