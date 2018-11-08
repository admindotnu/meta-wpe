PACKAGECONFIG = "incapp inctest increndergl incsbprotocol xdgv5"
CXXFLAGS_append = " -DWESTEROS_PLATFORM_DRM"

do_configure_prepend() {
    sed -i -e 's/-lwesteros_simplebuffer_client/-lwesteros_compositor -lwesteros_simplebuffer_client/g' ${S}/drm/westeros-sink/Makefile.am
}

# bbappend for raspberryPi
#
PACKAGECONFIG_rpi = "incapp inctest increndergl incsbprotocol xdgv4"
CXXFLAGS_append_rpi = " -DWESTEROS_PLATFORM_RPI -DWESTEROS_INVERTED_Y -DBUILD_WAYLAND -I${STAGING_INCDIR}/interface/vmcs_host/linux"

do_configure_prepend_rpi() {
    sed -i -e 's/-lwesteros_simplebuffer_client/-lwesteros_compositor -lwesteros_simplebuffer_client/g' ${S}/rpi/westeros-sink/Makefile.am
}

do_compile_prepend_rpi () {
	export WESTEROS_COMPOSITOR_EXTRA_LIBS="-lEGL -lGLESv2 -lbcm_host -lvchostif"
}

# Hikey 64-bit specific changes
#
do_install_append_hikey() {
    # change /usr/lib to /usr/lib64 in init script
    sed -i -e "s/usr\/lib\/lib/usr\/lib64\/lib/g" ${D}/${bindir}/westeros-init
}
