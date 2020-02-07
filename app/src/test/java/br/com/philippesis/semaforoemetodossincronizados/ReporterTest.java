package br.com.philippesis.semaforoemetodossincronizados;

import org.junit.Before;

import java.io.FileWriter;
import java.io.IOException;

import kotlin.jvm.Throws;

public class ReporterTest {

    Reporter reporter;

    @Before
    @Throws(exceptionClasses = Exception.class)
    public void setup() throws IOException {
        reporter = new Reporter(new FileWriter("reportFile"));
    }

}
