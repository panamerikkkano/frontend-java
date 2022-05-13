#!/bin/bash

find . -name "*.class" -type f -delete;
javac Frontend.java && java Frontend
