package com.xiaoyuan.service.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class BannedAccessFilter extends ZuulFilter {

	private Logger logger = Logger.getLogger(BannedAccessFilter.class);


//	@Value("${bannedURL}")
//	public String bannedURL;

	@Override
	public Object run() {
		logger.debug("===========进入web.gateway.BannedAccessFilter===========");

		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String requestUrl = request.getRequestURI();
		ctx.setSendZuulResponse(true);// 对请求进行路由
		logger.info("===========进入web.gateway请求路径==========="+requestUrl);

//		String userIp = getIpAddr(request);
//		logger.debug("===========进入web.gateway.BannedAccessFilter,IP:" + userIp + "===========");

//		boolean isWhite = checkIsWhite(userIp);
//		logger.debug("===========进入web.gateway.BannedAccessFilter,IP:" + userIp + ",是否白名单:" + isWhite + "===========");
//
//		// 存在白名单内的IP,直接通过
//		if (isWhite) {
//			ctx.setSendZuulResponse(true);// 对请求进行路由
//			ctx.set("success", true);
//			return null;
//		}
//
//		boolean isBanned = checkIsBanned(userIp);
//		logger.debug("===========进入web.gateway.BannedAccessFilter,IP:" + userIp + ",是否黑名单:" + isBanned + "===========");
//
//		// 存在黑名单内的IP.阻止路由.
//		if (isBanned) {
//			ctx.setSendZuulResponse(false);
//			ctx.getResponse().setContentType("text/html;charset=UTF-8");// 设置编码
//			ctx.setResponseBody(redirect());
//			ctx.set("success", false);
//			return null;
//		}
//
//		ctx.set("success", true);
		return null;
	}
	//
//	@Override
	public boolean shouldFilter() {
//		String isRun = jedisClusters.getRedisToNull(WebConstant.SERVICE_NAME, SystemConfigConstant.KEY_01_CODE);
//		logger.debug("===========进入web.gateway.shouldFilter(黑白名单过滤器是否启动),return-value:" + isRun + "===========");
//		// 是否执行该过滤器，true代表需要过滤
//		return Boolean.valueOf(StringHelper.isNull(isRun) ? "false" : isRun);
		return true;
	}
	//
//	@Override
	public int filterOrder() {
		// 优先级，数字越大，优先级越低
		return 0;
	}
	//
//	@Override
	public String filterType() {
		// 前置过滤器
		return "pre";
	}
//
//	/**
//	 * 获取登录用户远程主机ip地址
//	 *
//	 * @param request
//	 * @return
//	 */
//	private String getIpAddr(HttpServletRequest request) {
//		String ipAddress = request.getHeader("x-forwarded-for");
//		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
//			ipAddress = request.getHeader("Proxy-Client-IP");
//		}
//		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
//			ipAddress = request.getHeader("WL-Proxy-Client-IP");
//		}
//		if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
//			ipAddress = request.getRemoteAddr();
//			if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
//				// 根据网卡取本机配置的IP
//				InetAddress inet = null;
//				try {
//					inet = InetAddress.getLocalHost();
//				} catch (UnknownHostException e) {
//					e.printStackTrace();
//				}
//				ipAddress = inet.getHostAddress();
//			}
//		}
//		// 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
//		if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
//			if (ipAddress.indexOf(",") > 0) {
//				ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
//			}
//		}
//		return ipAddress;
//	}
//
//	/**
//	 * 是否在白名单
//	 *
//	 * @param userIp
//	 * @return
//	 */
//	public boolean checkIsWhite(String userIp) {
//		boolean bool = false;
//		Set<String> whiteSet = jedisClusters.getSet(WebConstant.SERVICE_NAME, "White");
//		for (String whiteIp : whiteSet) {
//			if (whiteIp.equals(userIp)) {
//				bool = true;
//				break;
//			}
//		}
//		return bool;
//	}
//
//	/**
//	 * 是否在黑名单
//	 *
//	 * @param userIp
//	 * @return
//	 */
//	public boolean checkIsBanned(String userIp) {
//		boolean bool = false;
//		Set<String> bannedSet = jedisClusters.getSet(WebConstant.SERVICE_NAME, "Banned");
//		for (String bannedIp : bannedSet) {
//			if (bannedIp.equals(userIp)) {
//				bool = true;
//				break;
//			}
//		}
//		return bool;
//	}
//
//	/**
//	 * 通过JS代码重定向到黑名单页面
//	 * @return
//	 */
//	public String redirect() {
//
//		StringBuilder html = new StringBuilder();
//
//		logger.debug("重定向URL:" + bannedURL);
//
//		if (StringHelper.isNull(bannedURL)) {
//			html.append("<h1>您在黑名单中,请联系管理员.<h1>");
//		} else {
//			html.append("<script>\n");
//			html.append("window.location.replace(\"" + bannedURL + "\");\n");
//			html.append("</script>\n");
//		}
//
//		return html.toString();
//	}

}
