public class GTVGApplication {

    private final org.thymeleaf.TemplateEngine templateEngine;


    public GTVGApplication(final javax.servlet.ServletContext servletContext) {

        super();

        org.thymeleaf.templateresolver.ServletContextTemplateResolver templateResolver =
                new org.thymeleaf.templateresolver.ServletContextTemplateResolver(servletContext);

        // HTML is the default mode, but we set it anyway for better understanding of code
        templateResolver.setTemplateMode(org.thymeleaf.templatemode.TemplateMode.HTML);
        // This will convert "home" to "/WEB-INF/templates/home.html"
        templateResolver.setPrefix("/templates/");
        templateResolver.setSuffix(".html");
        // Template cache TTL=1h. If not set, entries would be cached until expelled
        templateResolver.setCacheTTLMs(Long.valueOf(3600000L));

        // Cache is set to true by default. Set to false if you want templates to
        // be automatically updated when modified.
        templateResolver.setCacheable(true);

        this.templateEngine = new org.thymeleaf.TemplateEngine();
        this.templateEngine.setTemplateResolver(templateResolver);

    }

}