# spring-data-es
when you hit http://localhost:8080/demo/update you will get the below error.

threw exception [Request processing failed; nested exception is org.springframework.dao.DataIntegrityViolationException: Validation Failed: 1: id is missing;2: script or doc is missing;; nested exception is org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: id is missing;2: script or doc is missing;] with root cause

org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: id is missing;2: script or doc is missing;
	at org.elasticsearch.action.ValidateActions.addValidationError(ValidateActions.java:15) ~[elasticsearch-7.12.1.jar:7.12.1]
	at org.elasticsearch.action.update.UpdateRequest.validate(UpdateRequest.java:201) ~[elasticsearch-7.12.1.jar:7.12.1]
	at org.elasticsearch.client.RestHighLevelClient.performRequest(RestHighLevelClient.java:1620) ~[elasticsearch-rest-high-level-client-7.12.1.jar:7.12.1]
	at org.elasticsearch.client.RestHighLevelClient.performRequestAndParseEntity(RestHighLevelClient.java:1594) ~[elasticsearch-rest-high-level-client-7.12.1.jar:7.12.1]
	at org.elasticsearch.client.RestHighLevelClient.update(RestHighLevelClient.java:1061) ~[elasticsearch-rest-high-level-client-7.12.1.jar:7.12.1]
	at org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate.lambda$update$7(ElasticsearchRestTemplate.java:240) ~[spring-data-elasticsearch-4.2.1.jar:4.2.1]
	at org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate.execute(ElasticsearchRestTemplate.java:383) ~[spring-data-elasticsearch-4.2.1.jar:4.2.1]
	at org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate.update(ElasticsearchRestTemplate.java:240) ~[spring-data-elasticsearch-4.2.1.jar:4.2.1]
	at com.test.elasticsearch.demo.service.UpdateService.testUpdateQuery(UpdateService.java:29) ~[classes/:na]
	at com.test.elasticsearch.demo.web.TestUpdateController.update(TestUpdateController.java:19) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:567) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:197) ~[spring-web-5.3.7.jar:5.3.7]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:141) ~[spring-web-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:894) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1063) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:626) ~[tomcat-embed-core-9.0.46.jar:4.0.FR]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883) ~[spring-webmvc-5.3.7.jar:5.3.7]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:733) ~[tomcat-embed-core-9.0.46.jar:4.0.FR]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:227) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53) ~[tomcat-embed-websocket-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-5.3.7.jar:5.3.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.3.7.jar:5.3.7]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-5.3.7.jar:5.3.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.3.7.jar:5.3.7]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-5.3.7.jar:5.3.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119) ~[spring-web-5.3.7.jar:5.3.7]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:97) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:542) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:143) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:78) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:357) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:374) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:893) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1707) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) ~[na:na]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) ~[tomcat-embed-core-9.0.46.jar:9.0.46]
	at java.base/java.lang.Thread.run(Thread.java:835) ~[na:na]

