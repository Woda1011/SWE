package de.swe.util;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// https://docs.jboss.org/author/display/AS7/JAX-RS+Reference+Guide
@ApplicationPath("/rest")
public class SweRestApplication extends Application {
}
